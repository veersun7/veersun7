let btn=document.querySelector("button#bt1")
btn.addEventListener("click",(event)=>{
event.preventDefault()
let obj={
    sid: document.getElementById("i1").value, 
    name: document.getElementById("i2").value, 
    salary: document.getElementById("i3").value, 
}

caltax(obj)
    document.getElementById("i4").value = obj.tax

})

var caltax = function (a1) {
    a1.tax = a1.salary * .02;
    return a1;
};

