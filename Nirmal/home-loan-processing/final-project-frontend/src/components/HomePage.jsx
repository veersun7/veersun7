import React from "react";
import { Button, Container, Nav, Navbar } from "react-bootstrap";
import { useNavigate } from "react-router-dom";
import Natwest from "../images/Natwest.png";
import Natwest2 from "../images/Natwest2.png";
import linkedin from "../images/linkedin.png";
import twitter from "../images/twitter.png";

const HomePage = () => {
  const navigate = useNavigate();

  // Routing to Login page
  const RouteToLoginPage = () => {
    navigate("/login");
  };

  // Routing to Register page
  const RouteToSignUpPage = () => {
    navigate("/signup");
  };

  window.history.pushState(null, document.title, window.location.href);
  window.addEventListener("popstate", function (event) {
    window.history.pushState(null, document.title, window.location.href);
  });

  return (
    <div className="container-fluid">
      {/*  NavBar Starts here */}
      <Navbar
        style={{ backgroundColor: "#42145f" }}
        collapseOnSelect
        expand="lg"
        variant="purple"
      >
        <Container>
          <Navbar.Brand>
            <img
              src="https://cio-institute.com/wp-content/uploads/2022/10/NatWest-Group--150x150.jpeg"
              width="30"
              height="30"
              className="d-inline-block align-top"
              alt="React Bootstrap logo"
            />
          </Navbar.Brand>

          <Navbar.Brand style={{ color: "white" }}> Natwest Group</Navbar.Brand>

          <Navbar.Toggle aria-controls="responsive-navbar-nav" />
          <Navbar.Collapse id="responsive-navbar-nav">
            <Nav className="ms-5 me-auto"></Nav>
            {/* Login and Sign Up buttons */}
            <div>
              <Button
                variant="success"
                size="m"
                className="me-3"
                onClick={RouteToLoginPage}
              >
                Sign in
              </Button>
              <Button variant="success" size="m" onClick={RouteToSignUpPage}>
                Sign Up
              </Button>
            </div>
          </Navbar.Collapse>
        </Container>
      </Navbar>
      <div style={{ backgroundColor: "#ffc107" }}>
        <img
          className="rounded float-left"
          width="900"
          height="550"
          src={Natwest}
          alt="Natwest"
        />

        <img
          className="rounded float-right"
          width="750"
          height="550"
          src={Natwest2}
          alt="Natwest"
        />
      </div>

      <footer data-testid="footerunit" title="FooterUnit" className="py-1 my-2">
        <ul className="nav justify-content-center border-bottom pb-1 mb-1">
          <div class="col-md-1 col-lg-2 col-xl-1 mx-auto mb-4">
            <li
              data-testid="listName"
              className="nav-item nav-link px-2 text-muted"
            >
              Quick links
            </li>

            <li>
              <a href="link">Leadership & governance</a>
            </li>
            <li>
              <a href="link">GRG</a>
            </li>
            <li>
              <a href="link">Bank of APIs</a>
            </li>
            <li>
              <a href="link">Supplying goods and service UK</a>
            </li>
          </div>
          <div class="col-md-3 col-lg-2 col-xl-2 mx-auto mb-4">
            <li className="nav-item nav-link px-2 text-muted">Key reports</li>
            <li>
              <a href="link">Annual report and accounts (PDF 13MB)</a>
            </li>
          </div>
          <div class="col-md-4 col-lg-2 col-xl-2 mx-auto mb-4">
            <li className="nav-item nav-link px-2 text-muted">Contact Us</li>
            <li>
              <a href="link">FAQ's</a>
            </li>
            <li>
              <a href="link">Customer contacts</a>
            </li>
            <li>
              <a href="link">Investor contacts</a>
            </li>
            <li>
              <a href="link">Media contacts</a>
            </li>
            <li>
              <a href="link">Sustainable Banking contacts</a>
            </li>
          </div>
          <div class="col-md-5 col-lg-2 col-xl-2 mx-auto mb-4">
            <li className="nav-item nav-link px-2 text-muted">Downloads</li>
            <li>
              <a href="link">Modern Slavery Act (PDF 672KB)</a>
            </li>
            <li>
              <a href="link">Managing political activities (PDF 134KB)</a>
            </li>
            <li>
              <a href="link">Our readiness for resolution 2022 (PDF 1MB)</a>
            </li>
          </div>
        </ul>

        <ul className="nav justify-content-center border-bottom pb-1 mb-1 py-1 my-2">
          <li className="text-center px-2 text-muted">
            {" "}
            © Natwest Group 2023{" "}
          </li>
          <li className="text-center px-2 text-muted"> Cookie policy </li>
          <li className="text-center px-2 text-muted"> Privacy notice </li>
          <li className="text-center px-2 text-muted"> Legal information </li>
          <li className="text-center  px-2 text-muted"> Site map </li>
          <li className="text-center px-2 text-muted"> Accessibility </li>
        </ul>
        <a
          className="btn btn-outline-light btn-floating m-1"
          href="/india"
          role="button"
        >
          <img src={twitter} alt="" height="60" width=" 60" />
          <i className="fab fa-twitter"></i>
        </a>
        <a
          className="btn btn-outline-light btn-floating m-1"
          href="/india"
          role="button"
        >
          <img src={linkedin} alt="" height="60" width="60" />
          <i className="fab fa-linkedin-in"></i>
        </a>
      </footer>
    </div>
  );
};

export default HomePage;
