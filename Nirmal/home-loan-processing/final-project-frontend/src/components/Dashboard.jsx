import React from "react";
import { Card, Col, Row } from "react-bootstrap";
import rural from "../images/rural.jpg";
import exten from "../images/exten.jpg";
import prop from "../images/prop.jpg";
import commplot from "../images/commplot.jpg";
import UK from "../images/UK.jpg";
import US from "../images/US.jpg";
import other from "../images/other.jpg";
import top from "../images/top.jpg";
import comm from "../images/comm.jpg";
import reno from "../images/reno.jpg";
import homeloan from "../images/homeloan.jpg";
import plot from "../images/plot.jpg";
import DashboardFooter from "./DashboardFooter";
import DashboardHeader from "./DashboardHeader";

const Dashboard = () => {
  let localData = JSON.parse(localStorage.getItem("localBalance"));

  return (
    <div>
      <DashboardHeader />

      <div className="container px-5 py-2 m-auto">
        <marquee>
          <h3> Welcome to Natwest Group</h3>
        </marquee>
      </div>

      {/* Recommendation */}

      <div className="container px-5 py-2 m-auto">
        <h3>
          <center>Loan Products</center>
        </h3>
        <Row style={{ backgroundColor: "#F1CD83​" }}>
          <h3>Housing Loan</h3>
          <Col className="p-2">
            <Card style={{ width: "20rem" }}>
              <Card.Img variant="top" src={homeloan} />
              <Card.Body>
                <Card.Title>
                  {" "}
                  <center>Home Loans</center>
                </Card.Title>
                {/* <Card.Text>
  This card has supporting text below as a natural lead-in to
  additional content.{' '}
  </Card.Text> */}
              </Card.Body>
            </Card>
          </Col>
          <Col className="p-2">
            <Card style={{ width: "20rem" }}>
              <Card.Img variant="top" src={plot} />
              <Card.Body>
                <Card.Title>
                  <center>Plot Loans</center>
                </Card.Title>
                <Card.Text>
                  {/* This card has supporting text below as a natural lead-in to
  additional content.{' '} */}
                </Card.Text>
              </Card.Body>
            </Card>
          </Col>

          <Col className="p-2">
            <Card style={{ width: "20rem" }}>
              <Card.Img variant="top" src={rural} />
              <Card.Body>
                <Card.Title>
                  <center>Rural Housing Loans</center>
                </Card.Title>
                <Card.Text></Card.Text>
              </Card.Body>
            </Card>
          </Col>

          <h3>Other Housing Loan products</h3>
          <Col className="p-2">
            <Card style={{ width: "20rem" }}>
              <Card.Img variant="top" src={reno} />
              <Card.Body>
                <Card.Title>
                  <center>House Renovation Loans</center>
                </Card.Title>
                <Card.Text></Card.Text>
              </Card.Body>
            </Card>
          </Col>
          <Col className="p-2">
            <Card style={{ width: "20rem" }}>
              <Card.Img variant="top" src={exten} />
              <Card.Body>
                <Card.Title>
                  <center>Home Extension Loans</center>
                </Card.Title>
                <Card.Text></Card.Text>
              </Card.Body>
            </Card>
          </Col>
          <Col className="p-2">
            <Card style={{ width: "20rem" }}>
              <Card.Img variant="top" src={top} />
              <Card.Body>
                <Card.Title>
                  <center>Topup Loans </center>
                </Card.Title>
                <Card.Text></Card.Text>
              </Card.Body>
            </Card>
          </Col>

          <h3>Non Housing Loans</h3>
          <Col className="p-2">
            <Card style={{ width: "20rem" }}>
              <Card.Img variant="top" src={prop} />
              <Card.Body>
                <Card.Title>
                  <center>Loan Against Property</center>
                </Card.Title>
                <Card.Text></Card.Text>
              </Card.Body>
            </Card>
          </Col>

          <Col className="p-2">
            <Card style={{ width: "20rem" }}>
              <Card.Img variant="top" src={comm} />
              <Card.Body>
                <Card.Title>
                  <center>Commercial Property Loans </center>
                </Card.Title>
                <Card.Text></Card.Text>
              </Card.Body>
            </Card>
          </Col>

          <Col className="p-2">
            <Card style={{ width: "20rem" }}>
              <Card.Img variant="top" src={commplot} />
              <Card.Body>
                <Card.Title>
                  <center>Commercial Plot Loans</center>{" "}
                </Card.Title>
                <Card.Text></Card.Text>
              </Card.Body>
            </Card>
          </Col>

          <h3>NRI Housing Loans</h3>
          <Col className="p-2">
            <Card style={{ width: "20rem" }}>
              <Card.Img variant="top" src={UK} />
              <Card.Body>
                <Card.Title>
                  <center>United Kingdom</center>
                </Card.Title>
                <Card.Text></Card.Text>
              </Card.Body>
            </Card>
          </Col>

          <Col className="p-2">
            <Card style={{ width: "20rem" }}>
              <Card.Img variant="top" src={US} />
              <Card.Body>
                <Card.Title>
                  <center>United States</center>
                </Card.Title>
                <Card.Text></Card.Text>
              </Card.Body>
            </Card>
          </Col>

          <Col className="p-2">
            <Card style={{ width: "20rem" }}>
              <Card.Img variant="top" src={other} />
              <Card.Body>
                <Card.Title>
                  <center>Other Locations</center>
                </Card.Title>
                <Card.Text></Card.Text>
              </Card.Body>
            </Card>
          </Col>
        </Row>
      </div>
      <DashboardFooter />
    </div>
  );
};

export default Dashboard;
