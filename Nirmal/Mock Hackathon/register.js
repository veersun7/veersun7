console.log('script connected');
​
let studentdetails = []
​
function adduser () {
    let firstname = document.getElementById('firstname').value;
    let lastname = document.getElementById('lastname').value;
    let username = document.getElementById('username').value;
    let rollno = document.getElementById('rollno').value;
    let password = document.getElementById('password').value;
​
    obj = {
        'firstname':firstname,
        'lastname':lastname,
        'username':username,
        'rollno':rollno,
        'password':password
    }
console.log(obj);
if(obj.firstname=='' || obj.firstname==null || obj.lastname=='' || obj.lastname==null) {
​
    const err = document.getElementById('error-message')
    err.innerHTML='Need to fill all the fields. Unless the action will be not performed';
    console.log('if block executed');
} else{
​
    fetch('http://localhost:3000/studentdata',{
        method:"POST",
        headers:{
            "content-Type": "application/json"
        },
        body: JSON.stringify(obj)        
    }).then(result=>{console.log(result); 
        alert('Registration Success')
        window.open("http://127.0.0.1:5500/index.html")
    } )
    .catch(error=> {console.log(error);
        alert('Registration Failed')
​
    })
}
​
}
​
function getuserdata () {
​
    fetch('http://localhost:3000/studentdata',{
        method:"GET"
    }).then(result=> result.json())
    .then(data => studentdetails=data)
    .catch(error => alert(error));
}
​
function login () {
​
    const username = document.getElementById('username').value;
    const password = document.getElementById('password').value;
​
    console.log("username and password received");
    console.log(username + password)
    console.log(studentdetails)
​
    if(studentdetails.find(result=> result.username==username && result.password==password)){
        alert('Login success');
        window.open("http://127.0.0.1:5500/dashboard.html");
    }
    else {
	
		alert('invalid credentials')
	}
}
​
function logout () {
​
    window.open("http://127.0.0.1:5500/index.html");
}
​
function register () {
​
    window.open("http://127.0.0.1:5500/register.html");
}