const btnSignUp = document.querySelector("#signUp");
const chkAgree = document.querySelector("#chkAgree");
const signUpForm = document.querySelector("#signUpForm");

let userSignUp = {
  fullName: "",
  email: "",
  address: "",
  account: "",
  mobile: "",
  password: [],
};

const toggleSignUp = function (event) {
  if (chkAgree.checked) {
    btnSignUp.disabled = false;
  } else {
    btnSignUp.disabled = true;
  }
};

const signUp = function (event) {
  event.preventDefault();
  userSignUp.fullName = document.getElementById("fullName").value;
  userSignUp.email = document.getElementById("email").value;
  userSignUp.address = document.getElementById("address").value;
  userSignUp.account = document.getElementById("account").value;
  userSignUp.mobile = document.getElementById("mobile").value;
  userSignUp.password = document.getElementById("password").value;
  console.log(userSignUp);
  validation();
  clearValues();
};
const clearValues = function () {
  document.getElementById("signUpForm").reset();
  toggleSignUp();
};
const validation = function () {
  if (
    userSignUp.fullName != "" &&
    userSignUp.email != "" &&
    userSignUp.address != "" &&
    userSignUp.account != "" &&
    userSignUp.password != ""
  ) {
    alert("Registration successful.", "success");
  } else if (mobile.length != "10") {
    alert(
      "Please input 10 digit mobile number. Registration failed.",
      "danger"
    );
  } else {
    setTimeout(function () {
      window.location.href = "index.html";
    }, 3000);
  }
};
chkAgree.addEventListener("change", toggleSignUp);
signUpForm.addEventListener("submit", signUp);
const alertmsg = document.getElementById("alertMessage");
const alert = (message, type) => {
  const wrapper = document.createElement("div");
  wrapper.innerHTML = [
    `<div class="alert alert-${type} alert-dismissible" role="alert">`,
    `   <div>${message}</div>`,
    '   <button type="button" class="btn-close" data-bs-dismiss="alert" aria-label="Close"></button>',
    "</div>",
  ].join("");
  alertmsg.append(wrapper);
};
