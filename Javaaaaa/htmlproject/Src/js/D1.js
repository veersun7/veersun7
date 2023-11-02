// there is no data type in js
// its a dynamic type language i.e based on the language assigned,
// the data type will change

let a1 = 10;
console.log(" a1 = " + a1 ) ; // semi colon is optional

// now we are assigning string to the a1 this DDT ( dynamic data typing)
a1 = "Java script";
console.log(" a1 = " + a1 ) ;

// scope of the variable
// there are two scope 1) local - it is recognised only in respective block
// eg : {let a1 = 100}
// 2) global {var a1 = 100} can be used outside the block
for (var i=0;i<4;i++) {
    console.log(i);
}

// how to declare a array

console.log("outside the block "+i) ; 
console.log(".............array")

let ar = new Array ();
ar.push(10);
ar.push(20);
for(let i=0;i<ar.length;i++) {
console.log(ar[i]) ;
}   

console.log ("after pop the 0 the element---------")
ar.pop(0);
for(let i=0;i<ar.length;i++) {
    console.log(ar[i]) ;
}

console.log("-------END----------");
let k=[10, 20];
console.log(k[0]);
console.log(k[1]);

k1=[...k, 90]; // copies one array to another
console.log(k1[0]);
console.log(k1[1]);
console.log(k1[2]);

console.log("--------spread ends");


function add (a,b) {
    return a+b ;
}
console.log("---------function")
let n = add(10,34);
console.log(add(54,72))
console.log(n)


function add1(...x) {
    let s = 0;
    for (let i = 0 ; i<x.length;i++) {
        s = s + x[i];
    }
    return s;
}

n1 = add1(5,34,65,23)
console.log("------------REST operator")
console.log(n1)


let f1 = function(x,y) {
    return x-y;

}

console.log("-------------function variable")

console.log(f1(29,27));


// arrow function or lambda expression
// creating a function in simple way

f2 = (y,z)=>(y*z)
f3 = (y1,z1)=>{return y1/z1}

console.log("------------arrow function")
console.log(f2(20,20))
console.log(f3(10,5))

// call back functions
// a function that passes to another function

// below is to add remainder variable 
function rem (a,b) {
    return (a%b)
}
f4 = (a1,a2,a3)=>{
    return a3(a1,a2)
}
console.log("----------call back function")
console.log(f4(10,20,add));
console.log(f4(10,20,f1));
console.log(f4(10,20,f2));
console.log(f4(10,20,f3));
console.log(f4(10,20,rem));


// delay functions 

console.log("-----------delay functions")
f5=(a1,a2,a3)=>{
    console.log("in delay function");
    setTimeout(a3,1000);
    return    a3(a1,a2) ;
}

    console.log(f5(10,20,add));
    console.log(f5(10,20,f1));
    console.log(f5(10,20,f2));
    console.log(f5(10,20,f3));



