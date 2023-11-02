const btnSignUp = document.querySelector('#signUp')
const chkAgree = document.querySelector('#chkAgree')
const signUpForm = document.querySelector('#signUpForm')

const chkSports = document.querySelector('#chkSports')
const chkPolitics = document.querySelector('#chkPolitics')
const chkEnterainment = document.querySelector('#chkEnterainment')

let preferences = []

let userSignUp = {
    fullName: "", email: "", gender: "", edition: "", preferences: []
}
// function disableSignup() { btnSignUp.disabled = true }

const toggleSignUp = function (event) {
    if (chkAgree.checked) {
        btnSignUp.disabled = false
    } else {
        btnSignUp.disabled = true
    }
}

// form submit event handler
const signUp = function (event) {

    event.preventDefault()
    userSignUp.fullName = document.getElementById('fullName').value
    userSignUp.email = document.getElementById('email').value
    if (document.getElementById('rMale').checked) {
        userSignUp.gender = 'Male'
    } else if (document.getElementById('rFemale').checked) {
        userSignUp.gender = 'Female'
    }
    userSignUp.edition = document.getElementById('editions').value
    if (userSignUp.edition === 'Select an edition') {
        console.error('Select a proper value')
    }
    if (chkEnterainment.checked) {
        userSignUp.preferences.push(chkEnterainment.value)
    }
    if (chkPolitics.checked) {
        userSignUp.preferences.push(chkPolitics.value)
    }
    if (chkSports.checked) {
        userSignUp.preferences.push(chkSports.value)
    }

    console.log(userSignUp)
}

// disable the sign up button when the page is loaded
// document.addEventListener('DOMContentLoaded', disableSignup)

// enable the signup button when the user agrees to the terms and conditions
chkAgree.addEventListener('change', toggleSignUp)

signUpForm.addEventListener('submit', signUp)

