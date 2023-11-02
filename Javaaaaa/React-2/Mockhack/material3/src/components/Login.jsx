import React, { useState } from "react"
import axios from "axios"
import Navbar from "./Navbar"
import { useDispatch } from "react-redux"
import { useHistory } from "react-router-dom"
import {
    Button,
    TextField,
    Typography,
    Container,
    CssBaseline,
    AppBar,
} from "@mui/material";

import { login } from "../store";
const api = axios.create ({
    baseURL: "http://localhost:8089",

})

function Login() {
    const [email, setEmail] = useState("");
    const [password, setPassword] = useState("");
    const [message, setMessage] = useState("");
    const dispatch = useDispatch();
    const history = useHistory();

    const handleChange = (e) => {
        if (e.target.name === "email") {
          setEmail(e.target.value); // Updated state variable name
        } else if (e.target.name === "password") {
          setPassword(e.target.value); // Updated state variable name
        }
      };
      const handleSubmit = async (e) => {
        e.preventDefault();
        try {
          const response = await axios.post("/api/login", { email, password });
          const userData = response.data;
    
          if (userData) {
            // Successful login, navigate to dashboard
            history.push("/dashboard");
          } else {
            // Handle login failure (e.g., display an error message)
          }
        } catch (err) {
          console.error("Login Error:", err);
          // Handle login error
        }
      };
  return (
    <div
      style={{ display: "flex", flexDirection: "column", minHeight: "100vh" }}
    >
      <Navbar />
      <AppBar position="static">{/* ... */}</AppBar>
      <Container component="main" maxWidth="xs">
        <CssBaseline />
        <div>
          <Typography component="h1" variant="h5">
            Login
          </Typography>
          <form onSubmit={handleSubmit}>
            <TextField
              variant="outlined"
              margin="normal"
              required
              fullWidth
              id="email"
              label="Email ID"
              name="email" 
              onChange={handleChange}
            />
            <TextField
              variant="outlined"
              margin="normal"
              required
              fullWidth
              name="password"
              label="Password"
              type="password"
              id="password"
              onChange={handleChange}
            />
            <Button type="submit" fullWidth variant="contained" color="primary">
              Login
            </Button>
          </form>
          {message && (
            <Typography variant="body2" sx={{ marginTop: 2 }}>
              {message}
            </Typography>
          )}
        </div>
      </Container>
    </div>
  );
}

export default Login;

