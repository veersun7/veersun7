// To find sum and average of n numbers 

let ar = new Array();
function f1(){
    n = (parseInt(document.getElementById("a1").value));
    ar.push(n)
}

function f2(){
    var sum = 0
    var avg = 0
    for (i=0; i<ar.length;i++){
        sum += ar[i];
    }
    avg=sum/ar.length
    document.getElementById("sumtext").value = sum;
    document.getElementById("avgtext").value = avg;

}
function f3(){
    ar.pop()
}


function f4(){

    let t="<table border='2'>"
    for(i=0; i<ar.length;i++){
        t=t+"<td>"+ar[i]+"</td>"
    }
    t=t+"</table>"
    document.getElementById("all").innerHTML=t
    }