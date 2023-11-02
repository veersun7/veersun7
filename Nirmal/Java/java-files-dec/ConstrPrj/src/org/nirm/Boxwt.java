package org.nirm;

public class Boxwt extends Boxcolor {

	private float  density;
	public Boxwt(int length, int breadth, int height, String color, float d){
		super(length, breadth, height, color);
		this.density = d;
	}
		public float getDensity() {
			return density;
					}
		public void setDensity(float density) {
			this.density = density;
		}
}
