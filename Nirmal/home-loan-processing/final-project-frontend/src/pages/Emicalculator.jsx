import React, { useState } from "react";
import { Box, Button, TextField } from "@mui/material";
import Table from "@mui/material/Table";
import TableBody from "@mui/material/TableBody";
import TableCell from "@mui/material/TableCell";
import TableContainer from "@mui/material/TableContainer";
import TableHead from "@mui/material/TableHead";
import TableRow from "@mui/material/TableRow";
import Paper from "@mui/material/Paper";

import { Container } from "react-bootstrap";
import DashboardFooter from "../components/DashboardFooter";
import DashboardHeader from "../components/DashboardHeader";

const Emicalculator = () => {
  const localName = localStorage.getItem("nameData");

  const [loanAmnt, setLoanAmnt] = useState("");
  const [rate, setRate] = useState("");
  const [duration, setDuration] = useState("");
  const [emi, setEmi] = useState("");
  const [history, setHistory] = useState([]);

  const getAmount = localStorage.getItem("loanAmountData");
  const getRate = localStorage.getItem("rateData");
  const getDuration = localStorage.getItem("durationData");
  // const getHistory = localStorage.getItem('emiHistory')

  const calculateEmi = () => {
    const r = rate / (12 * 100);
    const emi =
      (loanAmnt * r * (1 + r) ** duration) / ((1 + r) ** duration - 1);
    setEmi(emi.toFixed(2));
    const newHistory = [
      ...history,
      { loanAmnt, rate, duration, emi: emi.toFixed(2) },
    ];
    setHistory(newHistory);
    // localStorage.setItem("loanAmountData",amnt.current.value)
    // localStorage.setItem("rateData",inRate.current.value)
    // localStorage.setItem("durationData",durat.current.value)
    localStorage.setItem("emiHistory", JSON.stringify(newHistory));
    setLoanAmnt("");
    setRate("");
    setDuration("");
  };

  return (
    <Container fluid>
      <DashboardHeader />
      <>
        <div style={{ marginTop: "30px" }}>
          <h2 style={{ color: "#42145f" }}>Home Loan EMI Calculator </h2>
        </div>
        <Box
          component="form"
          sx={{
            "& .MuiTextField-root": { m: 1, width: "27ch" },
          }}
          noValidate
          autoComplete="off"
        >
          <div style={{ paddingTop: "30px" }}>
            <TextField
              required
              id="outlined-required"
              label="Principal Amount"
              value={loanAmnt}
              onChange={(e) => setLoanAmnt(e.target.value)}
            />
            <TextField
              required
              id="outlined-required"
              label="Interest Rate"
              value={rate}
              onChange={(e) => setRate(e.target.value)}
            />
            <TextField
              required
              id="outlined-required"
              label="Duration (in months)"
              value={duration}
              onChange={(e) => setDuration(e.target.value)}
            />
          </div>
          <div style={{ marginTop: "30px" }}>
            <Button variant="outlined" onClick={calculateEmi}>
              Submit
            </Button>
          </div>

          {!getAmount && !getRate && !getDuration
            ? history.length > 0 && (
                <TableContainer component={Paper} sx={{ marginTop: 6 }}>
                  <Table sx={{ minWidth: 500 }} aria-label="customized table">
                    <TableHead sx={{ backgroundColor: "lightgrey" }}>
                      <TableRow>
                        <TableCell align="center">Amount</TableCell>
                        <TableCell align="center">Rate</TableCell>
                        <TableCell align="center">Duration</TableCell>
                        <TableCell align="center">Monthly EMI</TableCell>
                      </TableRow>
                    </TableHead>

                    <TableBody>
                      {history.map((row, index) => (
                        <TableRow
                          key={index}
                          sx={{
                            "&:last-child td, &:last-child th": { border: 0 },
                          }}
                        >
                          <TableCell align="center">£{row.loanAmnt}</TableCell>
                          <TableCell align="center">{row.rate}%</TableCell>
                          <TableCell align="center">{row.duration} Months</TableCell>
                          <TableCell align="center">£{emi}</TableCell>
                        </TableRow>
                      ))}
                    </TableBody>
                  </Table>
                </TableContainer>
              )
            : null}
        </Box>
      </>
      <br />
      <br />
      <br />
      <br />
      <DashboardFooter />
    </Container>
  );
};

export default Emicalculator;
