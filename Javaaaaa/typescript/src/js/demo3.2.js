let btn1 = document.querySelector("button#b1")
btn1.addEventListener("click",(event)=>{
event.preventDefault();

try{
    let n1 = document.querySelector("input#n1").value
    let n2 = document.querySelector("input#n2").value
    document.getElementById("out").innerText = addunion(parseInt(n1),n2)
}

catch(err){
document.getElementById("out").innerText = err.message
}

})

var addunion = function (n1, n2) {
    var an = 0;
    if (typeof (n1) === "number" && typeof (n2) === "number") {
        an = n1 + n2;
    }
    else if (typeof (n1) === "string" && typeof (n2) === "string") {
        an = parseInt(n1) + parseInt(n2);
    }
    else {
        throw new Error('Data type mismatch');
    }
    return an;

};

