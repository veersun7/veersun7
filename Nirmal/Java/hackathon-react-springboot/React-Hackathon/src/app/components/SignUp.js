import React, { Component } from "react";
import AppNavbar from "./AppNavbar";
import { Container } from "reactstrap";
import { Button, Form, FormGroup, Input, Label, Row, Col } from "reactstrap";
import { Alert } from "react-bootstrap";
import "../../App.css";
import Authentication from "../services/AuthenticationService";

const validEmailRegex = RegExp(
  /^(([^<>()\[\]\.,;:\s@\"]+(\.[^<>()\[\]\.,;:\s@\"]+)*)|(\".+\"))@(([^<>()[\]\.,;:\s@\"]+\.)+[^<>()[\]\.,;:\s@\"]{2,})$/i
);

const validateForm = (errors) => {
  let valid = true;
  Object.values(errors).forEach((val) => val.length > 0 && (valid = false));
  return valid;
};

class SignUp extends Component {
  constructor(props) {
    super(props);
    this.state = {
      name: "",
      address: "",
      username: "",
      email: "",
      accountnumber: "",
      mobilenumber: "",
      password: "",
      message: "",
      successful: false,
      validForm: true,
      errors: {
        name: "",
        address: "",
        username: "",
        email: "",
        accountnumber: "",
        mobilenumber: "",
        password: "",
      },
    };
  }
  changeHandler = (event) => {
    const { name, value } = event.target;
    let errors = this.state.errors;
    switch (name) {
      case "name":
        errors.name = value.length < 6 ? "name must be 6 characters long!" : "";
        break;
      case "address":
        errors.address =
          value.length < 10 ? "Address must be 10 characters long!" : "";
        break;
      case "username":
        errors.username =
          value.length < 5 ? "Username must be 5 characters long!" : "";
        break;
      case "email":
        errors.email = validEmailRegex.test(value) ? "" : "Email is not valid!";
        break;

      case "accountnumber":
        errors.accountnumber =
          value.length > 9 ? "" : "Account number is not valid!";
        break;

      case "mobilenumber":
        errors.mobilenumber =
          value.length > 9 ? "" : "Mobile number is not valid!";
        break;

      case "password":
        errors.password =
          value.length < 8 ? "Password must be 8 characters long!" : "";
        break;
      default:
        break;
    }

    this.setState({ errors, [name]: value }, () => {
      console.log(errors);
    });
  };

  signUp = (e) => {
    e.preventDefault();
    const valid = validateForm(this.state.errors);
    this.setState({ validForm: valid });
    if (valid) {
      Authentication.register(
        this.state.name,
        this.state.address,
        this.state.username,
        this.state.email,
        this.state.accountnumber,
        this.state.mobilenumber,
        this.state.password
      ).then(
        (response) => {
          this.setState({
            message: response.data.message,
            successful: true,
          });
        },
        (error) => {
          console.log("Fail! Error = " + error.toString());

          this.setState({
            successful: false,
            message: error.toString(),
          });
        }
      );
    }
  };

  render() {
    const title = <h2 className="h1">Register User</h2>;
    const errors = this.state.errors;

    let alert = "";

    if (this.state.message) {
      if (this.state.successful) {
        alert = <Alert variant="success">{this.state.message}</Alert>;
      } else {
        alert = <Alert variant="danger">{this.state.message}</Alert>;
      }
    }

    return (
      <div>
        <AppNavbar />
        <Container fluid>
          <Row>
            <Col sm="12" md={{ size: 4, offset: 4 }}>
              {title}
              <Form onSubmit={this.signUp}>
                <FormGroup controlid="forname">
                  <span className="text-danger">*</span>
                  <Label for="name">Name</Label>
                  <Input
                    type="text"
                    placeholder="Enter Name"
                    name="name"
                    id="name"
                    value={this.state.name}
                    autoComplete="name"
                    onChange={this.changeHandler}
                  />
                  {errors.name && <Alert variant="danger">{errors.name}</Alert>}
                </FormGroup>

                <FormGroup controlid="forAddress">
                  <span className="text-danger">*</span>
                  <Label for="address">Address</Label>
                  <Input
                    type="text"
                    placeholder="Enter Address"
                    name="address"
                    id="address"
                    value={this.state.address}
                    autoComplete="address"
                    onChange={this.changeHandler}
                  />
                  {errors.address && (
                    <Alert variant="danger">{errors.address}</Alert>
                  )}
                </FormGroup>
                <FormGroup controlid="forUsername">
                  <Label for="username">Username</Label>
                  <Input
                    type="text"
                    placeholder="Enter UserName"
                    name="username"
                    id="username"
                    value={this.state.username}
                    autoComplete="username"
                    onChange={this.changeHandler}
                  />
                  {errors.username && (
                    <Alert variant="danger">{errors.username}</Alert>
                  )}
                </FormGroup>

                <FormGroup controlid="formEmail">
                  <span className="text-danger">*</span>
                  <Label for="email">Email</Label>
                  <Input
                    required
                    type="text"
                    placeholder="Enter Email"
                    name="email"
                    id="email"
                    value={this.state.email}
                    autoComplete="email"
                    onChange={this.changeHandler}
                  />
                  {errors.email && (
                    <Alert variant="danger">{errors.email}</Alert>
                  )}
                </FormGroup>

                <FormGroup controlid="formAccountnumber">
                  <span className="text-danger">*</span>
                  <Label for="accountnumber">Accountnumber</Label>
                  <Input
                    required
                    type="number"
                    placeholder="Enter Accountnumber"
                    name="accountnumber"
                    id="accountnumber"
                    value={this.state.accountnumber}
                    autoComplete="accountnumber"
                    onChange={this.changeHandler}
                  />
                  {errors.accountnumber && (
                    <Alert variant="danger">{errors.accountnumber}</Alert>
                  )}
                </FormGroup>

                <FormGroup controlid="formMobilenumber">
                  <span className="text-danger">*</span>
                  <Label for="mobilenumber">MobileNumber</Label>
                  <Input
                    required
                    type="number"
                    placeholder="Enter MobileNumber"
                    name="mobilenumber"
                    id="mobilenumber"
                    value={this.state.mobilenumber}
                    autoComplete="mobilenumber"
                    onChange={this.changeHandler}
                  />
                  {errors.mobilenumber && (
                    <Alert variant="danger">{errors.mobilenumber}</Alert>
                  )}
                </FormGroup>

                <FormGroup controlid="formPassword">
                  <span className="text-danger">*</span>
                  
                  <Label for="password">Password</Label>

                  <Input
                    required
                    type="password"
                    placeholder="Enter Password"
                    name="password"
                    id="password"
                    value={this.state.password}
                    autoComplete="password"
                    onChange={this.changeHandler}
                  />

                  {errors.password && (
                    <Alert key="errorspassword" variant="danger">
                      {errors.password}
                    </Alert>
                  )}
                </FormGroup>

                <Button type="submit" variant="primary">
                  Register
                </Button>
                {!this.state.validForm && (
                  <Alert key="validForm" variant="danger">
                    Please check the inputs again!
                  </Alert>
                )}

                {alert}
              </Form>
            </Col>
          </Row>
        </Container>
      </div>
    );
  }
}

export default SignUp;
