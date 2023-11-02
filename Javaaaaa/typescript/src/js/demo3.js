//enum : enumeration class where certain value are called by the name
//ex: enum colours {green,blue,red}. In this case value of green is 1, red is 2, and blue is 3
//2. enum colours {green = 100,red,blue}. In this case value of green is 100, red is 101 and blue is 102.
//3. enum colours {green=100,red=200,blue=300}. In this case value of green is 100, red is 200, blue is 300.
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
//Union: Union support more than 1 data type to same argument of function. using or | operator
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
var caltax = function (a1) {
    a1.tax = a1.salary * .02;
    return a1;
};

module.exports ={
    enumdemo,addunion,caltax
}

