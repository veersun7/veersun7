import axios from "axios";
import React, { useState } from "react";
import { Container, Table } from "react-bootstrap";
import DashboardHeader from "../components/DashboardHeader";
import DashboardFooter from "../components/DashboardFooter";
import { Link } from "react-router-dom";
import underwriting from "../images/underwriting.jpg";
import valuation from "../images/propertyvalue.jpg";
import offer from "../images/offer.jpg";
import completed from "../images/completed.jpg";

const Status = () => {
  const [status, setstatus] = useState([]);

  axios
    .get(`http://localhost:8081/payee`)
    .then((res) => setstatus(res.data))
    .catch((err) => console.log(err));

  return (
    <div>
      <DashboardHeader />

      <Container className="mt-4  pt-2 pb-5">
        <div
          className="jumbotron"
          style={{
            backgroundColor: "white",
            color: "#42145f",
            marginBottom: 0,
          }}
        >
          <h1 className="display-4">Welcome to your Home Loan Dashboard</h1>
          <br />
          <br />
        </div>
        <Table
          className="jumbotron"
          variant="primary"
          border="1"
          style={{
            backgroundColor: "white",
            color: "#42145f",
            marginBottom: 0,
          }}
        >
          <thead>
            <tr>
              <th>
                <center>Loan Application No.</center>
              </th>
              <th>
                <center>Loan Type</center>
              </th>
              <th>
                <center>Amount</center>
              </th>
              <th>
                <center>Duration</center>
              </th>
              <th>
                <center>EMI</center>
              </th>
              <th>
                <center>Interest Rate</center>
              </th>
              <th>
                <center>Status</center>
              </th>
            </tr>
          </thead>
          <tbody>
            <tr>
              <td>
                <center>32563782</center>
              </td>
              <td>
                <center>Home Loan</center>
              </td>
              <td>
                <center>£30,000</center>
              </td>
              <td>
                <center>100 Months</center>
              </td>
              <td>
                <center>£320</center>
              </td>
              <td>
                <center>8.5%</center>
              </td>
              <td>
                <center>Application under processing</center>
              </td>
            </tr>
          </tbody>
        </Table>
        <br />

        <div>
          <div>
            {/* code for jumbotron */}

            <br />
          </div>
          <div className="jumbotron">
            <h6 className="display-5" style={{ color: "#42145f" }}>
              Know about application stages:
            </h6>
            <br />

            <div className="row">
              <div className="col">
                <a href="#apply">
                  <h4 style={{ color: "#42145f" }}>Apply for home loan</h4>
                </a>
              </div>
              <div className="col">
                <a href="#secure">
                  <h4 style={{ color: "#42145f" }}>Secure your property</h4>
                </a>
              </div>
              <div className="col">
                <a href="#sign">
                  <h4 style={{ color: "#42145f" }}>Sign the documents</h4>
                </a>
              </div>
              <div className="col">
                <a href="#settle">
                  <h4 style={{ color: "#42145f" }}>Settlement</h4>
                </a>
              </div>
            </div>
            <br />
            <br />
          </div>
        </div>
        {/* jumbotron ends here */}
        <div className="container">
          <div className="row">
            <div className="col" id="apply">
              <h1 style={{ color: "#42145f" }}>Apply for a home loan</h1>

              <ul>
                <li>
                  <h5 style={{ color: "#42145f" }}>
                    You can apply anytime online, over the phone or in person
                    with help from one of our Home Lending Specialists. They’ll
                    let you know exactly which documents you’ll need for your
                    application.
                  </h5>
                </li>
                <li>
                  <h5 style={{ color: "#42145f" }}>
                    If you’re buying at an auction chat to your Home Lending
                    Specialist about what’s required.
                  </h5>
                </li>
                <li>
                  <h5 style={{ color: "#42145f" }}>
                    Let your Home Lending Specialist know you’ve found your
                    property.
                  </h5>
                </li>
                <li>
                  <h5 style={{ color: "#42145f" }}>
                    Gather all the necessary documents (e.g. payslips, bank
                    statements).
                  </h5>
                </li>
                <li>
                  <h5 style={{ color: "#42145f" }}>
                    Find a solicitor or conveyancer who can help you with the
                    contract and any other legal documents.
                  </h5>
                </li>
                <li>
                  <h5 style={{ color: "#42145f" }}>
                    Estimated time to complete home loan application: 15mins –
                    48 hours.
                  </h5>
                </li>
              </ul>
            </div>
            <div className="col">
              <img src={underwriting} alt="apply" height="400" width="580" />
            </div>
          </div>
          <br />
          <br />
          <div className="row">
            <div className="col">
              <img src={valuation} alt="secure" height="400" width="580" />
            </div>
            <div className="col" id="secure">
              <h1 style={{ color: "#42145f" }}>
                Secure your property & pay the deposit
              </h1>

              <ul>
                <li>
                  <h5 style={{ color: "#42145f" }}>
                    You can use the Contract of Sale to negotiate your offer on
                    a property. Once accepted, both you and the vendor (seller)
                    sign this contract, which confirms selling price, settlement
                    terms and any other conditions for the sale.
                  </h5>
                </li>
                <li>
                  <h5 style={{ color: "#42145f" }}>
                    Arrange a property and pest inspection.
                  </h5>
                </li>
                <li>
                  <h5 style={{ color: "#42145f" }}>
                    Check with local and state governments about zoning and
                    future developments that may affect your home.
                  </h5>
                </li>
                <li>
                  <h5 style={{ color: "#42145f" }}>
                    Check if there’s a cooling off period for the contract
                  </h5>
                </li>
                <li>
                  <h5 style={{ color: "#42145f" }}>
                    Sign the contract and pay the deposit – usually 5-10% of the
                    property price
                  </h5>
                </li>
              </ul>
            </div>
          </div>

          <br />
          <br />
          <div className="row">
            <div className="col" id="sign">
              <h1 style={{ color: "#42145f" }}>
                Your home loan’s been approved, so it’s time to sign
              </h1>

              <ul>
                <li>
                  <h5 style={{ color: "#42145f" }}>
                    Once your loan application and documents are submitted,
                    we’ll review them and complete any necessary checks we need
                    to do at our end (e.g. property valuation, credit checks,
                    building documents) before we provide formal approval and
                    your loan offer documents.
                  </h5>
                </li>
                <li>
                  <h5 style={{ color: "#42145f" }}>
                    Complete stamp duty forms (if applicable) – your solicitor
                    or conveyancer will organise this.
                  </h5>
                </li>
                <li>
                  <h5 style={{ color: "#42145f" }}>
                    Review your loan documents, either in person with your Home
                    Lending Specialist or in NetBank with our SmartSign service.
                    You will need to sign the loan documents.
                  </h5>
                </li>
                <li>
                  <h5 style={{ color: "#42145f" }}>
                    Look into home insurance options prior to settlement.
                  </h5>
                </li>
                <li>
                  <h5 style={{ color: "#42145f" }}>
                    Estimated time for home loan approval (once documents
                    submitted): 1-5 business days
                  </h5>
                </li>
              </ul>
            </div>
            <br />
            <br />
            <div className="col">
              <img src={offer} alt="offer" height="400" width="580" />
            </div>
          </div>
          <br />
          <br />
          <div className="row">
            <div className="col">
              <img src={completed} alt="completed" height="400" width="580" />
            </div>
            <div className="col" id="settle">
              <h1 style={{ color: "#42145f" }}>Settle & move in</h1>

              <ul>
                <li>
                  <h5 style={{ color: "#42145f" }}>
                    Settlement is when the purchase of the property is completed
                    and it officially becomes yours. We will arrange a
                    settlement date, time and location with your solicitor or
                    conveyancer and notify you by SMS as soon as settlement is
                    completed.
                  </h5>
                </li>
                <li>
                  <h5 style={{ color: "#42145f" }}>
                    Arrange a pre-settlement inspection with the seller’s real
                    estate agent.
                  </h5>
                </li>
                <li>
                  <h5 style={{ color: "#42145f" }}>
                    Make sure you have enough money in your nominated CommBank
                    transaction account 48 hours before the settlement date –
                    your solicitor will advise how much you’ll need.
                  </h5>
                </li>
                <li>
                  <h5 style={{ color: "#42145f" }}>
                    Pick up your keys from the seller’s real estate agent.
                  </h5>
                </li>
                <li>
                  <h5 style={{ color: "#42145f" }}>
                    Estimated time from application to settlement: 4-6 weeks
                  </h5>
                </li>
              </ul>
            </div>
          </div>
          <br />
          <br />
          <div className="row">
            <h1 style={{ color: "#42145f" }}>
              <center>Congratulations! You’ve bought your home</center>
            </h1>
            <br />
            <br />
            <h5 style={{ color: "#42145f" }}>
              <center>
                Each home buying journey is different. Your Home Lending
                Specialist is there to guide you through these steps and help
                with anything specific to your situation.
              </center>
            </h5>
          </div>
        </div>
      </Container>
      <br />

      <DashboardFooter />
    </div>
  );
};

export default Status;
