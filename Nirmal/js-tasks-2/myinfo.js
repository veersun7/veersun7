const btnSave = document.querySelector('#Save')
const chkAgree = document.querySelector('#chkAgree')
const myinfo = document.querySelector('#myinfo')

// function disableSignup() { btnSignUp.disabled = true }

function toggleSave(event) {
    if (chkAgree.checked) {
        btnSave.disabled = false
    } else {
        btnSave.disabled = true
    }
}

// form submit event handler
function Save(event) {
    event.preventDefault()
    const GivenName = document.getElementById('GivenName').value
    const MiddleName = document.getElementById('MiddleName').value
    const Address1 = document.getElementById('Address1').value
    const postalcode = document.getElementById('postalcode').value
    const City = document.getElementById('City').value
    const Phone = document.getElementById('phone').value
    const countrycode = document.getElementById('countrycode').value
    const phonenumber = document.getElementById('phonenumber').value
        let group = ''
    if (document.getElementById('rYes').checked) {
        group = 'Yes'
    } else if (document.getElementById('rNo').checked) {
        group = 'No'
    }
    const country = document.getElementById('country').value
    if (country === 'India'){
        console.error('Select a proper value')
    }

    console.log(GivenName, MiddleName, Address1, postalcode, City, Phone, countrycode, phonenumber )
}

chkAgree.addEventListener('change', toggleSave)

myinfo.addEventListener('Submit', Save)
