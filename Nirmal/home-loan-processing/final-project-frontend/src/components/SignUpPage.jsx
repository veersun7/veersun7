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
import { useNavigate } from "react-router-dom";
import DashboardFooter from "./DashboardFooter";
import swal from "sweetalert";

const SignUpPage = () => {
  // Getting all the userinputs as a variable

  const [name, setname] = useState(``);
  const [accNo, setAccNo] = useState(``);
  const [email, setEmail] = useState(``);
  const [mobNo, setMobNo] = useState(``);
  const [password, setPassword] = useState(``);
  const [confirmpassword, setconfirmPassword] = useState(``);

  const [nameerror, setnameerror] = useState(``);
  const [accNoError, setAccNoError] = useState(``);
  const [emailError, setEmailError] = useState(``);
  const [mobNoError, setMobNoError] = useState(``);
  const [passwordError, setPasswordError] = useState(``);
  const [confirmpasswordError, setconfirmPasswordError] = useState(``);

  var [userDetails, setUserDetails] = useState([]);

  var email_exist;

  //Regex Variable to compare
  var regExEmail = /^[a-zA-Z0-9+_.-]+@[a-zA-Z0-9.-]+\.[a-zA-Z]{2,3}$/;
  var regexname = /[A-Za-z]{3,25}/;
  var regex10digits = /^[0-9]\d{09}$/; // to validate both phone no and account no
  var regExPwd =
    /^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[*@#%^&])(?!.* ).{8,20}$/;

  //setting up base url for request
  const api = axios.create({
    baseURL: `http://localhost:8081/users`,
  });

  useEffect(() => {
    api
      .get(`/`)
      .then((res) => setUserDetails(res.data))
      .catch((err) => console.log(err));
  });

  for (let i = 0; i < userDetails.length; i++) {
    if (email === userDetails[i].email) {
      email_exist = true;
    }
  }

  const SignUp = (event) => {
    event.preventDefault();
    if (
      regexname.test(name) &&
      regExEmail.test(email) &&
      regex10digits.test(accNo) &&
      regex10digits.test(mobNo) &&
      regExPwd.test(password) &&
      password != "" &&
      password == confirmpassword
    ) {
      var newUser = {
        name: name,
        accountNo: accNo,
        email: email,
        mobileNo: mobNo,
        password: password,
        confirmpassword: confirmpassword,
      };

      api
        .post(`/`, newUser)
        .then((response) => console.log(response))
        .catch((err) => console.log(err));

      swal("Registration Successfull. . .You can now login", " ", "success");
    } else {
      console.log("test");
      console.log(password);
      console.log(email_exist);

      if (!regexname.test(name)) {
        setnameerror(
          `Name length must be between 3 -20 characters, use only alphabets. numbers & special charaters not allowed`
        );
      }

      if (!regExEmail.test(email)) {
        setEmailError(`Please enter a valid email id`);
      }

      if (email_exist) {
        setEmailError(
          `Email ID already exist. Please use a different email Id or login to continue`
        );
      }

      if (!regex10digits.test(accNo)) {
        setAccNoError(`Please Enter a valid 10 digit account number`);
      }
      if (!regex10digits.test(mobNo)) {
        setMobNoError(`Please Enter a valid 10 digit mobile number`);
      }
      if (!regExPwd.test(password)) {
        setPasswordError(
          `Your password should contain atleast 8 characters. Must Contain 1 uppercase, 1 lowercase, 1 numeric and atleast 1 symbols ( @ # % ^ & - _ )`
        );
      }
      if (password != confirmpassword) {
        setconfirmPasswordError(`Confirm password should match the password`);
      }
    }
  };

  // Routing to diff components
  const navigate = useNavigate();

  const RouteToLoginPage = () => {
    navigate("/login");
  };
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

          <Navbar.Brand style={{ color: "white" }}>Natwest Group</Navbar.Brand>

          <Navbar.Toggle aria-controls="responsive-navbar-nav" />
          <Navbar.Collapse id="responsive-navbar-nav">
            <Nav className="ms-5 me-auto"></Nav>
          </Navbar.Collapse>
        </Container>
      </Navbar>
      <Row className="mt-4  pt-4">
        <Col lg={4} md={6} sm={9} className="p-4 m-auto shadow-lg rounded-full">
          <Form style={{ backgroundColor: "#f4f0e8" }}>
            <h4 className="text-center " style={{ color: "#42145f" }}>
              Natwest Group
            </h4>
            <h6 className="mb-3 text-center " style={{ color: "#42145f" }}>
              Registration form
            </h6>

            <FloatingLabel
              controlId="floatingInput"
              label="Full Name"
              className="mb-3"
              autoComplete="off"
            >
              <Form.Control
                type="text"
                placeholder="Name"
                onChange={(e) => {
                  setname(e.target.value);
                  setnameerror(``);
                }}
                isInvalid={!!nameerror}
              />
              <Form.Control.Feedback type="invalid">
                {nameerror}
              </Form.Control.Feedback>
            </FloatingLabel>
            <FloatingLabel
              controlId="floatingInput"
              label="Account Number"
              className="mb-3"
              autoComplete="off"
            >
              <Form.Control
                type="number"
                placeholder="Account Number"
                onChange={(e) => {
                  setAccNo(e.target.value);
                  setAccNoError(``);
                }}
                isInvalid={!!accNoError}
              />
              <Form.Control.Feedback type="invalid">
                {accNoError}
              </Form.Control.Feedback>
            </FloatingLabel>

            <FloatingLabel
              controlId="floatingInput"
              label="Email Address"
              className="mb-3"
              autoComplete="off"
            >
              <Form.Control
                type="email"
                placeholder="text@example.com"
                onChange={(e) => {
                  setEmail(e.target.value);
                  setEmailError(``);
                }}
                isInvalid={!!emailError}
              />
              <Form.Control.Feedback type="invalid">
                {emailError}
              </Form.Control.Feedback>
            </FloatingLabel>

            <FloatingLabel
              controlId="floatingInput"
              label="Mobile Number"
              className="mb-3"
              autoComplete="off"
            >
              <Form.Control
                type="number"
                placeholder="Mobile Number"
                onChange={(e) => {
                  setMobNo(e.target.value);
                  setMobNoError(``);
                }}
                isInvalid={!!mobNoError}
              />
              <Form.Control.Feedback type="invalid">
                {mobNoError}
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

            <FloatingLabel
              controlId="floatingPassword"
              label="ConfirmPassword"
              className="mb-3"
              autoComplete="off"
            >
              <Form.Control
                type="password"
                placeholder="ConfirmPassword"
                onChange={(e) => {
                  setconfirmPassword(e.target.value);
                  setconfirmPasswordError(``);
                }}
                isInvalid={!!confirmpasswordError}
              />
              <Form.Control.Feedback type="invalid">
                {confirmpasswordError}
              </Form.Control.Feedback>
            </FloatingLabel>

            <div className="text-center span2">
              <Button
                type="submit"
                variant="success"
                className="mb-2 mt-2 m-3 btn-block"
                onClick={SignUp}
              >
                Register
              </Button>
              <Button
                type="reset"
                variant="warning"
                className="mb-2 mt-2 btn-block"
              >
                Reset
              </Button>
            </div>
            <div className="text-center span2">
              <h6>Already have an account?</h6>
              <Button
                variant="success"
                className="mb-3 mt-2 m-3"
                onClick={RouteToLoginPage}
              >
                Sign in
              </Button>
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
      <DashboardFooter />
    </Container>
  );
};

export default SignUpPage;
