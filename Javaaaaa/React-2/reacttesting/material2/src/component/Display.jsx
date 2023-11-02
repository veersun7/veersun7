import React, { useState } from "react";
import axios from "axios";
import {
  Table,
  TableBody,
  TableCell,
  TableContainer,
  TableHead,
  TableRow,
  Button,
} from "@mui/material";

const api = axios.create({
  baseURL: "http://localhost:8088",
});

function Display() {
  const [view, setView] = useState([
    {
      id: "",
      fname: "",
      email: "",
      password: "",
    },
  ]);
  const display = async () => {
    try {
      let temp = await api.get("/userreg").then(({ data }) => data);
      setView(temp);
    } catch (err) {
      console.log(err.message);
    }
  };
  const display1 = () => {
    let n = view.map((row) => (
      <TableRow
        sx={{ "&:last-child td, &:last-child th": { border: 0 } }}
        key={row.id}
      >
        <TableCell align="left">{row.id}</TableCell>
        <TableCell align="left">{row.fname}</TableCell>
        <TableCell align="left">{row.email}</TableCell>
        <TableCell align="left">{row.password}</TableCell>
      </TableRow>
    ));
    return n;
  };
  return (
    <div>
      <Button onClick={display}>Read Data</Button>
      <TableContainer>
        <Table sx={{ minWidth: 650 }}>
          <TableHead>
            <TableRow>
              <TableCell>ID</TableCell>
              <TableCell>Name</TableCell>
              <TableCell>Email</TableCell>
              <TableCell>Password</TableCell>
            </TableRow>
          </TableHead>
          <TableBody>{display1()}</TableBody>
        </Table>
      </TableContainer>
    </div>
  );
}

export default Display;