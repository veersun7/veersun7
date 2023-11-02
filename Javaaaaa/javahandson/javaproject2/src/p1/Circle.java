package p1;

// create a class circle to read radius
// compute area, diameter
// display radius area, diameter

public class Circle {
float radius;
float pie = 3.14f;
float area;
float diameter;

public void read() {
	
System.out.println("enter radius for a circle ");
radius = Read.sc.nextFloat();
}
public void cal() {
	area = pie * radius * radius;
	diameter = 2 * radius;

	
}
}
