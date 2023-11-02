function f1(x) {
x();
}
function f2(){
console.log("I am in f2");

}
f1(f2);
function add(x,y) {
console.log(x+y) ;

}
function x1(a,b,c) {
    c(a,b)
}
x1(10,20,add)

