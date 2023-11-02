import React, { useRef, useState } from "react";
import emailjs from "@emailjs/browser";
import DashboardFooter from "../components/DashboardFooter";
import DashboardHeader from "../components/DashboardHeader";
import {
  FloatingLabel,
  Button,
  Col,
  Container,
  Form,
  Row,
} from "react-bootstrap";
import swal from "sweetalert";

export const ContactForm = () => {
  const form = useRef();

  const [name, setname] = useState(``);
  const [email, setemail] = useState(``);
  const [mobNo, setmobNo] = useState(``);
  const [producttype, setproducttype] = useState(``);
  const [nameerror, setnameerror] = useState(``);
  const [emailerror, setemailerror] = useState(``);
  const [mobNoerror, setmobNoerror] = useState(``);

  var regexname = /[A-Za-z]{3,25}/;
  var regex10digits = /^[0-9]\d{09}$/; // to validate both phone no and account no
  var regexemail = /^[a-zA-Z0-9+_.-]+@[a-zA-Z0-9.-]+\.[a-zA-Z]{2,3}$/;

  const sendEmail = (e) => {
    e.preventDefault();

    if (
      regexname.test(name) &&
      regex10digits.test(mobNo) &&
      regexemail.test(email)
    ) {
      emailjs
        .sendForm(
          "service_ji2c05q",
          "template_j3osoap",
          form.current,
          "DdeJ7DyM5ZDDlOCzd"
        )
        .then(
          (result) => {
            console.log(result.text);
            console.log("message sent");
          },
          (error) => {
            console.log(error.text);
          }
        );

      swal(
        "Thanks for your enquiry, Our team will contact you shortly",
        " ",
        "info"
      );
    } else {
      if (!regexname.test(name)) {
        setnameerror(
          `Name length must be between 3 -20 characters, use only alphabets. numbers & special charaters not allowed`
        );
      }
      if (!regex10digits.test(mobNo)) {
        setmobNoerror(`Please Enter a valid 10 digit account number`);
      }

      if (!regexemail.test(email)) {
        setemailerror(`Please enter a valid email id`);
      }
    }
  };

  return (
    <Container fluid>
      <DashboardHeader />

      <Row className="mt-2  pt-9">
        <Col
          lg={4}
          md={6}
          sm={9}
          className="p-3 m-auto shadow-lg rounded-lg bg-light"
        >
          <form
            style={{ backgroundColor: "#f4f0e8", borderRadius: "5%" }}
            ref={form}
            onSubmit={sendEmail}
          >
            <h4 className="text-center " style={{ color: "#42145f" }}>
              Home Loan Enquiry
            </h4>

            <FloatingLabel
              controlId="floatingInput"
              label="Name"
              className="mb-3"
              autoComplete="off"
            >
              <Form.Control
                type="text"
                name="user_name"
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
              label="Mobile Number"
              className="mb-3"
              autoComplete="off"
            >
              <Form.Control
                type="number"
                name="user_mobile"
                onChange={(e) => {
                  setmobNo(e.target.value);
                  setmobNoerror(``);
                }}
                isInvalid={!!mobNoerror}
              />
              <Form.Control.Feedback type="invalid">
                {mobNoerror}
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
                name="user_email"
                onChange={(e) => {
                  setemail(e.target.value);
                  setemailerror(``);
                }}
                isInvalid={!!emailerror}
              />
              <Form.Control.Feedback type="invalid">
                {emailerror}
              </Form.Control.Feedback>
            </FloatingLabel>
            <FloatingLabel>
              <FloatingLabel
                controlId="floatingInput"
                className="mb-3"
                autoComplete="off"
              ></FloatingLabel>
              <div class="form-group" className="mb-6">
                <select
                  class="form-select col-7  "
                  onChange={(e) => {
                    let value = e.target.value;
                    setproducttype(value);
                  }}
                >
                  <option value="Savings">Housing Loan</option>
                  <option value="Current">Other Housing Loan Products</option>
                  <option value="Current">Non Housing Loans</option>
                  <option value="Current">NRI Housing Loans</option>
                </select>
              </div>
            </FloatingLabel>
            <div className="text-center span2 mt-3">
              <Button
                type="submit"
                variant="success"
                className="mb-2 mt-2 m-3 btn-block"
                onClick={sendEmail}
              >
                Enquire Now
              </Button>
            </div>
          </form>
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
