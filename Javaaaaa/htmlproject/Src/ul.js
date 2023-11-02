// Create a unorder list which contain all item that we are added
// Create input box and button. 
// On click of button data in input box should be added to unordered list


let btn=document.querySelector("#b1")
btn.addEventListener("click", f1);

function f1(){
    let x = document.querySelector("input#p1").value 
    document.querySelector("input#p1").value=" " 
    let y = document.querySelector("ul#u1")
    
    let z = document.createElement("li")
    y.appendChild(z)
    z.textContent=x;
}