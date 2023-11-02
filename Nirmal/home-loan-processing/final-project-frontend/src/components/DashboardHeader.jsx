import React, { useState } from "react";
import { Button, Container, Nav, Navbar, NavDropdown } from "react-bootstrap";
import { Route, useNavigate } from "react-router-dom";
import { useSelector } from "react-redux";
import { logout } from "../features/userSlice";
import { useDispatch } from "react-redux";
import axios from "axios";
import Dashboard from "./Dashboard";

const DashboardHeader = (prop) => {
  const navigate = useNavigate();
  const user = useSelector((state) => state.user.value);
  const dispatch = useDispatch();
  const [loggedUser, setLoggedUser] = useState({});

  console.log(loggedUser);

  const RouteToApply = () => {
    navigate(`/apply`); //Apply
  };
  // const RouteToTransfer = () =>{
  //     navigate(`/transfer`)
  // }

  const RouteToEmicalculator = () => {
    navigate("/emicalculator"); //EMI
  };

  const RouteToProfile = () => {
    navigate("/profile");
  };
  const RouteToStatus = () => {
    navigate("/status"); //status
  };

  const RouteToDashboard = () => {
    navigate("/dashboard");
  };

  const RouteToContactForm = () => {
    navigate("/loan");
  };

  var userid = localStorage.getItem("email");
  console.log(userid);
  var token = localStorage.getItem("Token");
  console.log(token);

  axios
    .get(`http://localhost:8081/users/${userid}`)
    .then((response) => setLoggedUser(response.data))

    .catch((error) => console.log(error));

  const Logout = () => {
    navigate("/");
    localStorage.clear();
    dispatch(
      logout({
        id: "",
        username: "",
        loginStatus: false,
        component: <Route path="/dashboard" element={<Dashboard />} />,
      })
    );
  };

  return (
    <div>
      <div className="container-well">
        {/* Nav bar Starts here */}
        <Navbar
          style={{ backgroundColor: "#42145f" }}
          collapseOnSelect
          expand="lg"
          variant="light"
        >
          <Container>
            <Navbar.Brand>
              <img
                src="https://cio-institute.com/wp-content/uploads/2022/10/NatWest-Group--150x150.jpeg"
                width="30"
                height="30"
                className="d-inline-block align-top"
                alt="Natwest Logo"
              />
            </Navbar.Brand>
            <Navbar.Brand style={{ color: "white" }}>
              Natwest Group
            </Navbar.Brand>
            <Navbar.Toggle aria-controls="basic-navbar-nav" />
            <Navbar.Collapse id="basic-navbar-nav">
              <Nav className="ms-5 me-auto" style={{ color: "white" }}>
                <Nav.Link style={{ color: "white" }} onClick={RouteToDashboard}>
                  Loan Products
                </Nav.Link>
                <Nav.Link
                  style={{ color: "white" }}
                  onClick={RouteToContactForm}
                >
                  Enquiry
                </Nav.Link>
                <Nav.Link style={{ color: "white" }} onClick={RouteToProfile}>
                  About Me
                </Nav.Link>
                <Nav.Link style={{ color: "white" }} a href="/eligibility">
                  Eligibility Check
                </Nav.Link>
                <Nav.Link
                  style={{ color: "white" }}
                  onClick={RouteToEmicalculator}
                >
                  EMI Calculator
                </Nav.Link>
                <Nav.Link style={{ color: "white" }} onClick={RouteToApply}>
                  Apply Home loan
                </Nav.Link>
                <Nav.Link a href="/status" style={{ color: "white" }}>
                  Status
                </Nav.Link>
              </Nav>
            </Navbar.Collapse>
            <Navbar.Collapse className="justify-content-end">
              <Navbar.Text style={{ color: "white" }}>
                User: {loggedUser.email}{" "}
              </Navbar.Text>
              <Button
                variant="success"
                size="sm"
                className="ms-3"
                style={{ color: "white" }}
                onClick={Logout}
              >
                Logout
              </Button>
            </Navbar.Collapse>
          </Container>
        </Navbar>
      </div>
    </div>
  );
};

export default DashboardHeader;
