import React from "react";
import { Col, Container, Row, Table } from "react-bootstrap";
import Image from "react-bootstrap/Image";
import DashboardFooter from "../components/DashboardFooter";
import DashboardHeader from "../components/DashboardHeader";
import profile from "../images/profile.jpg";
const Profile = () => {
  let loggedUser = JSON.parse(localStorage.getItem("loggedUser"));

  return (
    <div>
      <DashboardHeader />
      <Container>
        <Row className="mt-4 pt-4 mb-5">
          <Col
            lg={4}
            md={6}
            sm={9}
            style={{ backgroundColor: "#f4f0e8", borderRadius: "5%" }}
            className="p-3 m-auto shadow-lg rounded-lg "
          >
            <h4 className="text-center" style={{ color: "#42145f" }}>
              Personal Information{" "}
            </h4>
            <div className="d-flex align-items-center justify-content-center pb-3">
              <Image
                src={profile}
                width={120}
                height={120}
                alt="171x180"
                rounded
              />
            </div>

            <Table variant="secondary">
              <tbody>
                <tr>
                  <td style={{ color: "#42145f" }}>Username</td>
                  <td>{loggedUser.name}</td>
                </tr>
                <tr>
                  <td style={{ color: "#42145f" }}>Account No</td>
                  <td>{loggedUser.accountNo}</td>
                </tr>
                <tr>
                  <td style={{ color: "#42145f" }}>Email Id</td>
                  <td>{loggedUser.email}</td>
                </tr>
                <tr>
                  <td style={{ color: "#42145f" }}>Mobile No</td>
                  <td>{loggedUser.mobileNo}</td>
                </tr>
              </tbody>
            </Table>
          </Col>
        </Row>
      </Container>
      <br />
      <br />
      <DashboardFooter />
    </div>
  );
};

export default Profile;
