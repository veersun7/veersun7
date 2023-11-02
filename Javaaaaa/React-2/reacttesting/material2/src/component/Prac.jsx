import React, { useState } from "react";
import TextField from "@mui/material/TextField";
import Button from "@mui/material/Button";
import Container from "@mui/material/Container";
import Axios from "axios";

const Registration = () => {
  const [formData, setFormData] = useState({
    id: "",
    fname: "",
    email: "",
    password: "",
  });

  const [registrationSuccessful, setRegistrationSuccessful] = useState(false);

  const handleChange = (e) => {
    const { name, value } = e.target;
    setFormData({
      ...formData,
      [name]: value,
    });
  };

  const handleSubmit = async (e) => {
    e.preventDefault();

    try {
      const response = await Axios.post(
        "http://localhost:8088/userreg",
        formData
      );
      console.log("Registration successful!", response.data);
      setRegistrationSuccessful(true);
    } catch (error) {
      console.error("Registration failed!", error);
    }
  };

  return (
    <Container maxWidth="sm">
      <h2>Registration</h2>
      {registrationSuccessful ? (
        <div>
          <p>Registration is successful!</p>
        </div>
      ) : (
        <form onSubmit={handleSubmit}>
          <TextField
            label="ID"
            name="id"
            fullWidth
            value={formData.id}
            onChange={handleChange}
            required
          />
          <TextField
            label="First Name"
            name="fname"
            fullWidth
            value={formData.fname}
            onChange={handleChange}
            required
          />
          <TextField
            label="Email"
            name="email"
            type="email"
            fullWidth
            value={formData.email}
            onChange={handleChange}
            required
          />
          <TextField
            label="Password"
            name="password"
            type="password"
            fullWidth
            value={formData.password}
            onChange={handleChange}
            required
          />
          <Button
            type="submit"
            variant="contained"
            color="primary"
            fullWidth
            style={{ marginTop: "20px" }}
          >
            Register
          </Button>
        </form>
      )}
    </Container>
  );
};

export default Registration;

