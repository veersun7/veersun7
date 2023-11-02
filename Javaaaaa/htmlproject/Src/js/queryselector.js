let btn = document.querySelector("button#b1");
btn.addEventListener("click", f1)

let btn1 = document.querySelector("button#b2");
btn1.addEventListener("click", f2)

let btn2 = document.querySelector("button#b3");
btn2.addEventListener("click", f3)

function f1(Event){
    
    in1=document.querySelector("input#a1")
    in2=document.querySelector("input#a2")
    in3=document.querySelector("input#a3")
    in3.value=parseInt(in1.value)+parseInt(in2.value);
}

function f2(Event){
    
    in1=document.querySelector("input#a1")
    in2=document.querySelector("input#a2")
    in3=document.querySelector("input#a3")
    in1.value="";
    in2.value="";
    in3.value="";
}
function f3(Event){
    let lbl=document.querySelectorAll("label");
    for (const item of lbl) {
        item.style.color = "red"
        };
}