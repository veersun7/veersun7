// Create Registration Component with ID, fname, Email & Password and store in DB using post method

// import React, { useState } from "react"
// import axios from "axios"

// function Registration () {
//     const [msg, setMsg] = useState ("")
//     const [formdata, setFormData] = useState ({
//     id : "",
//     fname : "",
//     Email : "",
//     password : ""
// })
// }

// const handleChange = (e) => {
//     const { name, value } = e.target;
//     setFormData({
//       ...formData,
//       [name]: value,
//     });
//   };

//   const checkLogin = async (e) => {
//     e.preventDefault();
//     try {
//       const url = `/userreg/?id=${id}&fname=${fname}&email=${email}&password=${password}`;
//       let temp = await api.post(url).then(({ data }) => data);
      
//       if (id === temp.id && pass === temp.password) {
//         setMsg("Login successful!");
//       } else {
//         setMsg("Invalid login");
//       }
//     } catch (err) {
//       console.log(err.message);
//     }
//   };

// <div>
//     <form>
// <div class="mb-3">
//   <label for="exampleFormControlInput1" class="form-label">Enter ID:</label>
//   <input type="email" class="form-control" id="id"></input>
// </div>
// <div class="mb-3">
//   <label for="exampleFormControlInput1" class="form-label">Enter fname:</label>
//   <input type="email" class="form-control" id="fname"></input>
// </div>
// <div class="mb-3">
//   <label for="exampleFormControlInput1" class="form-label">Enter email ID:</label>
//   <input type="email" class="form-control" id="email"></input>
// </div>
// <div class="mb-3">
// <label for="exampleFormControlInput1" class="form-label">Enter Password:</label>
// <input type="email" class="form-control" id="pass"></input>
// </div>
// <div>
// <button type="submit">Register</button>
// </div>
//         </form>
//     </div>

// export default Registration


import React, { useState } from 'react';

function Registration() {
  const [formData, setFormData] = useState({
    id: '',
    fname: '',
    email: '',
    password: '',
  });

  const handleChange = (e) => {
    const { name, value } = e.target;
    setFormData({
      ...formData,
      [name]: value,
    });
  };

  const handleSubmit = (e) => {
    e.preventDefault();

  
   // wait api.get("/userreg/" + id)
    fetch('/api/userreg/', {
      method: 'POST',
      headers: {
        'Content-Type': 'application/json',
      },
      body: JSON.stringify(formData),
    })
      .then((response) => response.json())
      .then((data) => {
        // Handle the server response (e.g., show success message, redirect, etc.)
        console.log(data);
      })
      
      .catch((error) => {
        console.error('Error:', error);
      });
  };

  return (
    <div className="registration">
      <h1>Registration Form</h1>
      <form onSubmit={handleSubmit}>
        <div>
          <label htmlFor="id">ID:</label>
          <input
            type="text"
            id="id"
            name="id"
            value={formData.id}
            onChange={handleChange}
            required
          />
        </div>
        <div>
          <label htmlFor="fname">First Name:</label>
          <input
            type="text"
            id="fname"
            name="fname"
            value={formData.fname}
            onChange={handleChange}
            required
          />
        </div>
        <div>
          <label htmlFor="email">Email:</label>
          <input
            type="email"
            id="email"
            name="email"
            value={formData.email}
            onChange={handleChange}
            required
          />
        </div>
        <div>
          <label htmlFor="password">Password:</label>
          <input
            type="password"
            id="password"
            name="password"
            value={formData.password}
            onChange={handleChange}
            required
          />
        </div>
        <button type="submit">Register</button>
      </form>
    </div>
  );
}

export default Registration;
