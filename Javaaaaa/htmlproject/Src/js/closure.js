function f1() {
var age =20 ;
return function f2(){
age++;
return age;
}

}
let x=new f1();
console.log(x())
console.log(x())
console.log(x())
console.log(f1())
console.log(f1())
console.log(f1())





