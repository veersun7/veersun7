function Traingle (x, y, z){
    if (x == y && y == z)
    console.log("Equilateral Triangle");
    else if (x == y || y == z || z == x)
    console.log("Isosceles Triangle");
   else
   console.log("Scalene Triangle");
}
 let x = 10, y = 20, z = 20;
  Traingle (x, y, z);