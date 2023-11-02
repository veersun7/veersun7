package org.nirm;

public class Boxcolor extends Box {
	
	private String color;

	public Boxcolor(int l, int b, int h, String color) {
		super(l,b,h);
				this.color = color;
	}

	@Override
	public String toString() {
		return "Boxcolor [color=" + color + "]";
	}

}
