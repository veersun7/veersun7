package org.nirm;

public class Box implements Measurement {
	
	int length;
	int breadth;
	int height;
//	
	
	Box(){
		//no args constructor or default constructor
		System.out.println("Default Constructor called");
	}
	
	Box(int a1){ 
		//Single args constructor
		length = breadth = height = a1;
		System.out.println("Constructor with one parameter called");
	}
	
	Box(int l, int b, int h){
		//All args constructor
		length = l;
		breadth = b;
		height = h;
		System.out.println("Constructor with all the parameters called");
	}
	
	
		
//	void setData(int l, int b, int h) {
//		length = l;
//		breadth = b;
//		height = h;
//	}
//	void show() {
//		System.out.println("Box length : " + length + " breadth : " + breadth + " height: " + height);
//	}

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public int getBreadth() {
		return breadth;
	}

	public void setBreadth(int breadth) {
		this.breadth = breadth;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	@Override
	public String toString() {
		return "Box [length=" + length + ", breadth=" + breadth + ", height=" + height + "]";
	}

	public int volume() {
		return length*breadth*height;}
	}
	


