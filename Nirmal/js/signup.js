const btnSignUp = document.querySelector('#signUp')
const chkAgree = document.querySelector('#chkAgree')
const signUpForm = document.querySelector('#signUpForm')

// function disableSignup() { btnSignUp.disabled = true }

function toggleSignUp(event) {
    if (chkAgree.checked) {
        btnSignUp.disabled = false
    } else {
        btnSignUp.disabled = true
    }
}

// form submit event handler
function signUp(event) {
    event.preventDefault()
    const fullName = document.getElementById('fullName').value
    const email = document.getElementById('email').value
    let gender = ''
    if (document.getElementById('rMale').checked) {
        gender = 'Male'
    } else if (document.getElementById('rFemale').checked) {
        gender = 'Female'
    }
    const edition = document.getElementById('editions').value
    if (edition === 'Select an edition'){
        console.error('Select a proper value')
    }

    console.log(fullName, email, gender, edition)
}

// disable the sign up button when the page is loaded
// document.addEventListener('DOMContentLoaded', disableSignup)

// enable the signup button when the user agrees to the terms and conditions
chkAgree.addEventListener('change', toggleSignUp)

signUpForm.addEventListener('submit', signUp)
