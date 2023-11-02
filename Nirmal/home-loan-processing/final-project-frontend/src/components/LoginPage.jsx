import axios from "axios";
import React, { useEffect, useState } from "react";
import {
  Button,
  Col,
  Container,
  FloatingLabel,
  Form,
  Row,
  Nav,
  Navbar,
} from "react-bootstrap";
import { Link, Route, useNavigate } from "react-router-dom";
import { login } from "../features/userSlice";
import { useDispatch } from "react-redux";
import Dashboard from "./DashboardHeader";
import bcrypt from "bcryptjs";
import DashboardFooter from "./DashboardFooter";

const LoginPage = () => {
  const [userEmail, setUserEmail] = useState(``);
  const [password, setPassword] = useState(``);
  const [userDetails, setUserDetails] = useState([]);

  const [emailError, setEmailError] = useState(``);
  const [passwordError, setPasswordError] = useState(``);

  var loginValidationStatus = false;
  const dispatch = useDispatch();
  var db_id = "";
  var db_encryptedpwd = "";
  var emailId = false;
  var db_username = "";

  const api = axios.create({
    baseURL: `http://localhost:8081/users`,
  });

  useEffect(() => {
    api
      .get(`/`)
      .then((res) => setUserDetails(res.data))
      .catch((err) => console.log(err));
  });

  async function Login(event) {
    event.preventDefault();

    for (let i = 0; i < userDetails.length; i++) {
      if (userEmail.toLowerCase() === userDetails[i].email.toLowerCase()) {
        db_id = userDetails[i].email;
        db_encryptedpwd = userDetails[i].password;
        db_username = userDetails[i].name;
        emailId = true;
      }
    }

    loginValidationStatus = await bcrypt.compare(password, db_encryptedpwd);

    if (loginValidationStatus) {
      // setSuccessMsg("login success. Navigating to dashboard...")

      axios
        .post(`http://localhost:8081/login`, {
          email: userEmail,
          password: password,
        })
        .then((response) => {
          console.log(response.data.jwtToken);
          localStorage.setItem("Token", response.data.jwtToken);
          localStorage.setItem("email", userEmail);
          navigate("/dashboard");
        })
        .catch((error) => console.log(error));
      axios
        .get(`http://localhost:8081/users/${userEmail}`)
        .then((response) => {
          console.log(response.data);
          localStorage.setItem("loggedUser", JSON.stringify(response.data));
        })
        .catch((error) => console.log(error));
      localStorage.setItem("fromAmount", JSON.stringify(0));
      localStorage.setItem("localBalance", JSON.stringify(10000));

      dispatch(
        login({
          id: db_id,
          username: db_username,
          loginStatus: true,
          component: <Route path="/dashboard" element={<Dashboard />} />,
        })
      );
    } else if (!emailId) {
      setEmailError(`Email id doesn't exist. Please Sign Up`);
    } else if (!loginValidationStatus) {
      setPasswordError(`Invalid Credentials`);
    } else {
      // alert(`Password doesnt match our records`)
    }
  }

  // Routing to diff components
  const navigate = useNavigate();

  const RouteToHomePage = () => {
    navigate("/");
  };

  return (
    <Container fluid>
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
          </Navbar.Collapse>
        </Container>
      </Navbar>

      <Row className="mt-4 pt-4 ">
        <Col
          lg={4}
          md={6}
          sm={9}
          className="p-3 m-auto shadow-lg rounded-lg bg-light"
        >
          <Form style={{ backgroundColor: "#f4f0e8" }}>
            <h4 className="text-center" style={{ color: "#42145f" }}>
              Natwest Group
            </h4>
            <h4 className="mb-3 text-center " style={{ color: "#42145f" }}>
              Sign in{" "}
            </h4>
            <FloatingLabel
              controlId="floatingInput"
              label="User email"
              className="mb-3"
              autoComplete="off"
            >
              <Form.Control
                type="email"
                placeholder="name@example.com"
                onChange={(e) => {
                  setUserEmail(e.target.value);
                  setEmailError(``);
                }}
                isInvalid={!!emailError}
              />
              <Form.Control.Feedback type="invalid">
                {emailError}
              </Form.Control.Feedback>
            </FloatingLabel>

            <FloatingLabel
              controlId="floatingPassword"
              label="Password"
              className="mb-3"
              autoComplete="off"
            >
              <Form.Control
                type="password"
                placeholder="Password"
                onChange={(e) => {
                  setPassword(e.target.value);
                  setPasswordError(``);
                }}
                isInvalid={!!passwordError}
              />
              <Form.Control.Feedback type="invalid">
                {passwordError}
              </Form.Control.Feedback>
            </FloatingLabel>
            {/* <Form.Control.Feedback type='valid'>
                                {successMsg}
                            </Form.Control.Feedback> */}
            <div className="text-center span2">
              <Button
                type="submit"
                variant="success"
                className="mb-2 mt-2 m-10 btn-block"
                onClick={Login}
              >
                Sign in
              </Button>
            </div>

            <div className="text-center">
              <Button
                variant="warning"
                className="mb-3"
                onClick={RouteToHomePage}
              >
                Back to Home
              </Button>
            </div>
          </Form>
        </Col>
      </Row>
      <br />
      <br />
      <br />
      <br />
      <br />
      <br />
      <br />
      <br />
      <DashboardFooter />
    </Container>
  );
};

export default LoginPage;
