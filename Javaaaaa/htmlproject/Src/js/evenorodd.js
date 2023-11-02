
function f1(){
 let n = parseInt(document.getElementById("il").value)
 let text = evenodd (n)
 document.getElementById("out").innerText = text

}

function evenodd(n){
    if (isNaN(n)|| n == null) {
        return 'non numeric'
    }

    if (n % 2 === 0){
        return 'even';
    }
    else{
        return 'odd'
    }
}

function numpyramid(n) {
    let x = ""
    for(i=1;i<=n;i++){
    for (j=1;j<=n-i;j++){
        x= x+" "
    }
    for (j=1;j<=i;j++){
        x= x+"* "
    }

    x=x+'\n'
    }
    return x
}
module.exports = {
    evenodd,numpyramid
}