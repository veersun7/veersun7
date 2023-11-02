import { Box, Button, Container, TextField, Typography } from "@mui/material"
import React, { useState } from "react"
import axios from "axios"
//import { Password } from "@mui/icons-material"

const api = axios.create({
    baseURL: "http://localhost:8088",
})

function Login() {
    const [msg,setMsg] = useState("")
    const [id, setId] = useState("")
    const [pass,setPass] = useState("")

    const checkLogin = async (e) => {
        e.preventDefault ()
        try  {
            let temp = await api.get("/userreg/" + id).then(({ data }) => data);
            console.log(temp);
            if(id===temp.id  && pass === temp.password) {
            setMsg("Login successful!")
            } else {
            setMsg("Invalid login")
            }
          } catch (err) {
            console.log(err.message);
          }
        };

return (
    <div>
      <main>
        <Container maxWidth="xs"
          sx={{
            marginTop: "100px",
            border: "solid",
            borderRadius: "10px",
          }}>
          <Box>
            <Box
              component="form"
              sx={{
                paddingTop: 2,
                paddingRight: 4,
                paddingBottom: 4,
                paddingLeft: 2,
              }}>
              <Typography variant="h4" align="center">
                Login
              </Typography>
              <TextField
                variant="outlined" label="Enter Username" fullWidth
                sx={{
                  margin: "10px",
                }}
                onBlur={(e) => {setId(e.target.value)}}
              ></TextField>
              <TextField
                variant="outlined" label="Enter Password" type="password"
                fullWidth
                sx={{
                  margin: "10px",
                }}
                onBlur={(e) => {setPass(e.target.value)}}
              ></TextField>
              <Button
                variant="contained" fullWidth
                sx={{
                  margin: "10px",
                }}
                onClick={checkLogin}>
                Login
              </Button>
            </Box>
          </Box>
          <Typography variant="h6" align="center">
            {msg}
          </Typography>
        </Container>
      </main>
    </div>
  );
}

export default Login 