var sel = document.querySelector("select#a1")
sel.addEventListener("change",changecolour)

function changecolour(Event){
let l1 =document.querySelector("h1#changetext")
let clr = sel.value
l1.style.color= clr
}
