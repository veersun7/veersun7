function f2(n) {

    let x = parseInt(document.getElementById("a1").value) ;
    let y = parseInt(document.getElementById("a2").value)

    if (n===1) {z = x+y} 
    if (n===2) {z = x-y}
    if (n===3) {z = x*y}
    if (n===4) {z = x/y}

    document.getElementById("a3").value = z  
}

//other way instead of using 'if' statement
// let arr = new Array ();
// arr[0] = (x,y) => (x+y);
// arr[1] = (x,y) => (x-y);
// arr[2] = (x,y) => (x*y);