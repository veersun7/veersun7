//enum : enumeration class where certain value are called by the name
//ex: enum colours {green,blue,red}. In this case value of green is 1, red is 2, and blue is 3
//2. enum colours {green = 100,red,blue}. In this case value of green is 100, red is 101 and blue is 102.
//3. enum colours {green=100,red=200,blue=300}. In this case value of green is 100, red is 200, blue is 300.

// create type script to take a value and return the string value of enum class:

const enum colours{red=1,green,blue,yellow}
let enumdemo = (n: number):string=>{   
    let col : string = ""
switch (n){
case colours.red : col = "red";
break;
case colours.green : col = "green";
break;
case colours.blue : col = "blue";
break;
case colours.yellow : col = "yellow";
break;
}
return col;

}

//Union: Union support more than 1 data type to same argument of function. using or | operator

var addunion = (n1: number|string, n2: number|string):number=>{
    let an : number = 0
    if (typeof(n1)=== "number" && typeof(n2)==="number"){
        an = n1+n2
    }
    else if(typeof(n1)==="string" && typeof(n2)==="string"){
        an = parseInt(n1)+parseInt(n2)
    }
    else{
        throw new Error('Data type mismatch')
    }
    return an
    }

//Intersection : Intersection/Interface
//Create Intersection using interface, Accept SID, Name, salary and calculate Tax

interface emp{
    sid : string,
    name : string,
    salary : number,
    tax : number
}

let caltax = (a1:emp):emp=>{
    a1.tax = a1.salary * .02
    return a1

}


