
function f1(){
    n = parseInt(document.getElementById("s1").value)
    console.log(n)
    let h1 = document.querySelector("h1#title1")
    h1.style.color = enumdemo(n)
}

var enumdemo = function (n) {
    var col = "";
    switch (n) {
        case 1 /* colours.red */:
            col = "red";
            break;
        case 2 /* colours.green */:
            col = "green";
            break;
        case 3 /* colours.blue */:
            col = "blue";
            break;
        case 4 /* colours.yellow */:
            col = "yellow";
            break;
    }
    return col;
};

