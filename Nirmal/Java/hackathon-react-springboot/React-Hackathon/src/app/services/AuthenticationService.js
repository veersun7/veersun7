import axios from "axios";



class AuthenticationService {
  signin = (username, password) => {
      return axios.post("/api/auth/signin", {username, password})
        .then(response => {
          if (response.data.accessToken) {
            localStorage.setItem("user", JSON.stringify(response.data));
          }
          return response.data;
        })
        .catch(err => {
          console.log(err);
          throw err;
        });
  }

  signOut() {
    localStorage.removeItem("user");
  }

  register = async(name, address, username, email,accountnumber,mobilenumber, password) => {
    return axios.post("/api/auth/signup", {
      name,
      address,
      username,
      email,
      accountnumber,
      mobilenumber,
      password
    });
  }

  getCurrentUser() {
    return JSON.parse(localStorage.getItem('user'));;
  }
}

export default new AuthenticationService();
