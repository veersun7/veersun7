import React, { Component } from 'react';
import { Collapse, Nav, Navbar, NavbarBrand, NavbarToggler, NavbarText, NavItem, NavLink } from 'reactstrap';
import { Link } from 'react-router-dom';
import Logo1 from './images/Logo1.png'
import { withRouter } from 'react-router-dom';
import AuthenticationService from '../services/AuthenticationService';
import "../../App.css";
class AppNavbar extends Component {
  constructor(props) {
    super(props);
    this.state = {isOpen: false};
    this.toggle = this.toggle.bind(this);

    this.state = {
      showUser: false,
      showPM: false,
      showAdmin: false,
      username: undefined,
      login: false
    };
  }

  componentDidMount() {
    const user = AuthenticationService.getCurrentUser();

    if (user) {
      const roles = [];

      user.authorities.forEach(authority => {
        roles.push(authority.authority)
      });
  
      this.setState({
        showUser: true,
        showPM: roles.includes("ROLE_PM") || roles.includes("ROLE_ADMIN"),
        showAdmin: roles.includes("ROLE_ADMIN"),
        login: true,
        username: user.username
      });
    }
  }

  signOut = () => {
    AuthenticationService.signOut();
    this.props.history.push('/home');
    window.location.reload();
  }

  toggle() {
    this.setState({
      isOpen: !this.state.isOpen
    });
  }

  render() {
    return(
    <Navbar color="White" light expand="md" >
        <Nav className="mr-auto">
        {this.state.showUser &&
         (<NavbarText className="bold" > Welcome, {this.state.username}!</NavbarText>
         )}
        </Nav>
      <NavbarToggler onClick={this.toggle}/>
      <Collapse isOpen={this.state.isOpen} navbar>
        {
          this.state.login ? (
            <Nav className="ml-auto" navbar>
              <NavItem>
              <button class="btn btn-primary" type="submit">
                <NavLink href="#" onClick={this.signOut}>LogOut</NavLink>
                </button>
              </NavItem>
            </Nav>                 
          ) : (
            
            <Nav className="bl-auto" navbar>
            <img
                src={Logo1}
                alt=""
                width="80"
                height="64"
                class="d-inline-block align-text-top"
              />
              <NavLink href="/">
              <h1 className="h1 fst-italic">Digi Wallet</h1></NavLink>
                <small className="small fst-italic">Pay @ anytime</small>
              <NavItem>
                <NavLink href="/signin">Login</NavLink>
              </NavItem>
              <NavItem>
                <NavLink href="/signup">Register</NavLink>
              </NavItem>
            </Nav>
          )
        }
      </Collapse>
    </Navbar>   
    )
  }
}

export default withRouter(AppNavbar);