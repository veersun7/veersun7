import * as React from "react";
import DashboardFooter from "../components/DashboardFooter";
import DashboardHeader from "../components/DashboardHeader";
import { Button, Col, Container, Form, Row } from "react-bootstrap";
import Box from "@mui/material/Box";
import { Link } from "react-router-dom";
import credit from "../images/credit.png";
import deposit from "../images/deposit.png";
import proof from "../images/proof.jpg";
import apply from "../images/apply.jpg";

function Eligibility() {
  return (
    <Container fluid>
      <DashboardHeader />
      <Box>
        <section class="col-xs-12 col-sm-9 col-md-8 col-lg-12 col-lg col-sm col-md py-10">
          {/* code for jumbotron */}
          <div
            className="jumbotron"
            style={{
              backgroundColor: "#fbba20",
              color: "#42145f",
              borderRadius: 5,
            }}
          >
            <div className="row">
              <div className="col-12">
                <h1
                  className="display-4 col-xl-8 col-sm-6 col-md-6 col-lg-6 col-lg col-sm col-md"
                  style={{ color: "#42145f" }}
                >
                  <center>Home loan Eligibility</center>
                </h1>
              </div>
            </div>
          </div>
          {/* jumbotron ends here */}
        </section>
        <br />
        <br />

        <Box className="container">
          <div className="row">
            <div className="col">
              <img
                src={apply}
                alt="eligible"
                height="350"
                width="600"
                style={{ borderRadius: 10 }}
              />
            </div>
            <div className="col">
              <h2 style={{ color: "#42145f" }}>
                Getting prepared for when you apply for a mortgage{" "}
              </h2>
              <h5>
                <br></br>
                <ul style={{ color: "#42145f" }}>
                  <li>
                    Before you apply for a mortgage, it will be useful to have
                    several documents to hand as well as having a good
                    understanding of your finances to help prepare you for
                    getting a mortgage.
                  </li>
                  <br></br>
                  <li>
                    Read on to find out what documents you may need to apply for
                    a mortgage.
                  </li>
                </ul>
              </h5>
            </div>
          </div>
          <br />
          <br />

          <div className="row">
            <div className="col">
              <h2 style={{ color: "#42145f" }}>1. Check your credit report</h2>
              <h5>
                <br></br>
                <ul style={{ color: "#42145f" }}>
                  <li>
                    You can view your credit score on our app or if you don’t
                    have the NatWest app you can use various platforms such as
                    Experian, Equifax or ClearScore.{" "}
                  </li>
                  <br></br>
                  <li>
                    There are ways to help improve your credit score (such as
                    registering on the Electoral Roll at your main address)
                    which you may want to try and tackle if you already know
                    what your credit score is.
                  </li>
                </ul>
              </h5>
            </div>
            <div className="col">
              <img
                src={credit}
                alt="newhouse"
                height="350"
                width="600"
                style={{ borderRadius: 10 }}
              />
            </div>
          </div>
          <br />
          <div className="row">
            <div className="col">
              <img
                src={proof}
                alt="percentage"
                height="350"
                width="600"
                style={{ borderRadius: 10 }}
              />
            </div>
            <br />
            <br />
            <div className="col">
              <h2 style={{ color: "#42145f" }}>2. Proof of ID</h2>
              <h5>
                <ul style={{ color: "#42145f" }}>
                  <li>
                    A passport or driving license are the more commonly used
                    documents for proof of ID but we will accept other forms of
                    ID if you don't have these. You'll also need to make sure
                    these documents are in date.{" "}
                  </li>
                </ul>
              </h5>
              <h2 style={{ color: "#42145f" }}>
                3. Proof of address documents
              </h2>
              <h5>
                <ul style={{ color: "#42145f" }}>
                  <li>
                    These can include council tax bills, utility bills, bank
                    statements and should be dated within the last three months.
                  </li>
                </ul>
              </h5>
            </div>
            <br />
            <br />
            <br />
            <div className="row">
              <div className="col">
                <h2 style={{ color: "#42145f" }}>
                  4. Evidence of where your deposit is coming from
                </h2>
                <h5>
                  <br></br>
                  <ul style={{ color: "#42145f" }}>
                    <li>
                      This is important as lenders will need to see Proof of
                      Deposit to understand where your deposit is coming from.
                    </li>
                    <br></br>
                    <li>
                      If your deposit is from your savings, you’ll need to
                      provide evidence via bank statements and any large
                      payments will need to be explained. The bank statements
                      will also need to show your name and address.
                    </li>
                    <br></br>
                    <li>
                      Gifted mortgage deposits will usually require a signed
                      letter from the person who is gifting you the money. At
                      NatWest, we require a signed letter or email (no signature
                      required) from the gifting party, confirming the gift is
                      either non repayable or repayable.{" "}
                    </li>
                  </ul>
                </h5>
              </div>
              <br />
              <br />
              <br />
              <div className="col">
                <img
                  src={deposit}
                  alt="newhouse"
                  height="350"
                  width="600"
                  style={{ borderRadius: 10 }}
                />
              </div>
            </div>
            <br />
            <br />

            <div className="row">
              <div className="col">
                <h2 style={{ color: "#42145f" }}>5. Proof of expenses</h2>
                <h5>
                  <br></br>
                  <ul style={{ color: "#42145f" }}>
                    <li>
                      As well as proof of income, expenses are also needed to
                      ensure that the mortgage loan amount suits your lifestyle
                      and requirements.
                    </li>
                    <br></br>
                    <li>
                      Lenders will look for any financial commitments that may
                      have an effect on how much you can afford in relation to
                      your monthly mortgage repayments.
                    </li>
                    <br></br>
                  </ul>
                </h5>
              </div>
            </div>
            <div className="row">
              <div className="col">
                <h2 style={{ color: "#42145f" }}>6. Proof of income</h2>
                <h5>
                  <br></br>
                  <ul style={{ color: "#42145f" }}>
                    <li>
                      Payslips - Last 3 months payslips. If you have recently
                      started a new job or changed salary, you’ll need to be
                      able to provide proof of your salary. If you would like us
                      to consider any additional bonus payments or overtime we
                      would need to see the corresponding payslips or the Year
                      to Date figure on the payslip.
                    </li>
                    <br></br>
                    <li>
                      Bank statements - Last 3 months bank statements. This
                      should be the account that your salary is paid into. This
                      is to ensure figures match on payslips compared to the
                      relevant bank account. We may request to see bank
                      statements from other bank accounts you hold to help us
                      with eligibility criteria. We can also consider letters
                      from managers or the business you work for if you are
                      unable to provide payslips or bank statements.
                    </li>
                    <br></br>
                  </ul>
                </h5>
              </div>
            </div>
          </div>
          <br />

          <h4 style={{ color: "#42145f" }}>
            Please click <Link to="/apply">here</Link> to start the application
          </h4>
        </Box>
      </Box>

      <br />
      <br />
      <br />
      <br />
      <DashboardFooter />
    </Container>
  );
}

export default Eligibility;
