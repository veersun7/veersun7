let ar = new Array();
function f1(){
    var EmpName = document.getElementById("name")
    var EmpEmail = document.getElementById("email")
    var EmpAddress = document.getElementById("address")
    var data = {
        "EmpName":EmpName.value,
        "EmpEmail":EmpEmail.value,
        "EmpAddress":EmpAddress.value,
    }
    ar.push(data)
}
function f2(){
    let t="<table border='2'>"
    t=t+"<tr>"
    t=t+"<th>"+"EmpName"+"</th>"
    t=t+"<th>"+"EmpEmail"+"</th>"
    t=t+"<th>"+"EmpAddress"+"</th>"
    t=t+"</tr>"
    for(i=0; i<ar.length;i++){
        t=t+"<tr>"
        t=t+"<td>"+ar[i].EmpName+"</td>"
        t=t+"<td>"+ar[i].EmpEmail+"</td>"
        t=t+"<td>"+ar[i].EmpAddress+"</td>"
        t=t+"</tr>"
    }
    t=t+"</table>"
    document.getElementById("display").innerHTML=t
    }
function f3(){
    ar.pop()
}