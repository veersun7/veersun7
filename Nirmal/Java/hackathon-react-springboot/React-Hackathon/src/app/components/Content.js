import React, { Component } from "react";
import AppNavbar from "./AppNavbar";
import Footer from "./Footer";
import {
  Collapse,
  Nav,
  Navbar,
  NavbarBrand,
  NavbarToggler,
  NavbarText,
  NavItem,
  NavLink,
} from "reactstrap";
import AuthenticationService from "../services/AuthenticationService";
import Dashboards from "./images/Dashboards.JPG";
import Dashboard1 from "./images/Dashboard1.JPG";
import Dashboard2 from "./images/Dashboard2.JPG";
import Dashboard3 from "./images/Dashboard3.JPG";
import Dashboard4 from "./images/Dashboard4.JPG";
import Logo1 from "./images/Logo1.png";
function Content() {
  return (
    <div>
      <section>
        <Navbar className="ml-auto" light expand="md">
          <img
            src={Logo1}
            alt=""
            width="80"
            height="64"
            class="d-inline-block align-text-top"
          />
          <NavLink href="/">
            <h1 className="h1 fst-italic">Digi Wallet</h1>
          </NavLink>
          <small className="small fst-italic">Pay @ anytime</small>
        </Navbar>
        <AppNavbar />
      </section>

      <section>
        <div class="card">
          <img src={Dashboards} class="card-img-top" alt="" href="" />
          <img src={Dashboard1} class="card-img-top" alt="" href="" />
          <img src={Dashboard2} class="card-img-top py" alt="" href="" />
          <img src={Dashboard3} class="card-img-top py" alt="" href="" />
          <img src={Dashboard4} class="card-img-top py" alt="" href="" />
        </div>
      </section>
      <Footer />
    </div>
  );
}

export default Content;
