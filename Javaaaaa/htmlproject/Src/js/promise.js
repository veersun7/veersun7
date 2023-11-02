// Design an application to display content of given file
// If file exist in backend content should be
// displayed else it should say “File not found”

var filename = ""
function display(){
    
    filename = document.getElementById("a1").value;
    filereadpromise=f1();
     filereadpromise.then(
        function(value) {showcontent(value);},
        function(error) {showerror(error);}
      );
}
function f1(){

filereadpromise = new Promise(function(solver,rejected){
    var req = new XMLHttpRequest();
       req.onload = function(){
        if (req.status == 200){
            solver(req.response)
        }
        else{
            rejected("File not found")
        }
    }
    req.open('GET',filename);
    req.send()
});
return filereadpromise
}
function showcontent(fcontent){
    document.getElementById("show").innerHTML=fcontent;
}
function showerror(error){
    document.getElementById("show").innerHTML=error;
}