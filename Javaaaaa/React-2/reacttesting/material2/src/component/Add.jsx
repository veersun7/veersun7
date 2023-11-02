import React, { useState } from "react"
import { Box, Button, Container, FormGroup, TextField, Typography, } from "@mui/material"

function Add() {
    const [addobject, setAddobject] = useState ({
        num1: 0,
        num2: 0,
        sum: 0,
    })

    const add =()=> {
        setAddobject({...addobject, sum: addobject.num1 + addobject.num2 })
    }
    return  (
    <div>
<Container> 
    <Box 
    sx={{ 
        border: 4,
        borderColor: "green",
        margin: "20px 20px",
        display: "flex",
        flexDirection: "column",
        borderRadius: "5%",
        backgroundColor: "wheat",
        paddingRight: "40px",
        paddingTop: "40px",
    }}
        maxWidth="sm"
    >
    <FormGroup>
    <Container sx={{ margin: "20px 20px" }}>
    <TextField
        variant="outlined"
        label="Enter number 1"
        id="num1"
        sx={{ marginRight: "20px" }}
        onBlur={(e) => {
            setAddobject({...addobject, num1: parseInt(e.target.value),
            })
        }}
        fullWidth
    ></TextField>
</Container>
<Container sx={{ margin: "20px" }}>
    <TextField
        variant="outlined"
        label="Enter number 2"
        id="num2"
        onBlur={(e) => {
            setAddobject({...addobject, num2: parseInt(e.target.value),
            })
        }}
        fullWidth
    ></TextField>
</Container>
<Container sx={{ margin: "20px 20px" }}>
    <Button variant="contained" onClick={add}>
        Add
        </Button>
        </Container>
        </FormGroup>
        </Box>
<Container>
<Typography variant="h3">Sum is : {addobject.sum}</Typography>
</Container>
</Container>
</div>
    )
}

export default Add