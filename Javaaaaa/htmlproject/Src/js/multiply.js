function f1() {
    let n=(parseInt(document.getElementById("a1").value))
      let t="<table border='4'>"
      for (i=1; i<=10; i++) {
          t=t+"<tr>"
          t=t+"<td>"+n+"</td>"
          t=t+"<td>"+"x"+"</td>"
          t=t+"<td>"+i+"</td>"
          t=t+"<td>"+"="+"</td>"
          t=t+"<td>"+n*i+"</td>"
          t=t+"</tr>"
  }
      t=t+"</table>"
      document.getElementById("x").innerHTML=t

}