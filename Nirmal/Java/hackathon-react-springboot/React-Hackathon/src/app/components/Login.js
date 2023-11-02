import React, { Component } from 'react';
import AppNavbar from './AppNavbar';
import { Container } from 'reactstrap';
import { Form, Alert, FormGroup, Input, Label, Row, Col } from "reactstrap";
import {Button} from 'react-bootstrap';
import AuthenticationService from "../services/AuthenticationService";
import Three from './images/Three.jpg'
import '../../App.css';

class Login extends Component {

  constructor(props) {
    super(props);

    this.state = {
      username: "",
      password: "",
      error: ""
    };
  }

  changeHandler = (event) => {
    let nam = event.target.name;
    let val = event.target.value;
    this.setState({[nam]: val});
  }

  doLogin = async (event) => {
    event.preventDefault();

    AuthenticationService
        .signin(this.state.username, 
                  this.state.password)
      .then(
        () => {
          this.props.history.push('/content');
        },
        error => {
          console.log("Login fail: error = { " + error.toString() + " }");
          this.setState({error: "Can not signin successfully ! Please check username/password again"});
        }
    );
  }

  render() {
    return ( 
      <div>
        <AppNavbar/>
        <Container fluid>
          
          <Row style={{marginTop:"20px"}}>
          <Col sm="12" md={{ size: 3, offset: 4 }}>
                  <div className="col-md-9 col-lg-7 col-xl-9 ">
              <img src={Three} className="img-fluid" alt="" />
            </div>
            <Form  onSubmit={this.doLogin}>
              <FormGroup>
                <Label for="username"><strong>User Name</strong></Label>
                <Input autoFocus 
                  type="text"
                  name="username" id="username"
                  value={this.state.username}
                  placeholder="Enter Username"
                  autoComplete="username"
                  onChange={this.changeHandler}
                />
              </FormGroup>


              <FormGroup>
                <Label for="password"><strong>Password</strong></Label>
                <Input type="password" 
                  name="password" id="password"
                  value={this.state.password}
                  placeholder="Enter Password"
                  autoComplete="password"
                  onChange={this.changeHandler}
                />
              </FormGroup>

              <Button type="submit" variant="primary" size="lg" block>
                Log In
              </Button>
              {
                this.state.error && (
                  <Alert color="danger">
                    {this.state.error}
                  </Alert>
                )
              }
              
            </Form>
            </Col>
          </Row>
        </Container>
      </div>);
  }
}

export default Login;