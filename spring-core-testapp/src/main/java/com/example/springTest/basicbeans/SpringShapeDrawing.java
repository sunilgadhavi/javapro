package com.example.springTest.basicbeans;

public class SpringShapeDrawing {
	
	private SpringBasicShape shape;

	public SpringShapeDrawing(SpringBasicShape shape) {
		this.shape = shape;
	}
	
	public void drawShape() {
		System.out.println("drawShape called for " + this.shape.getClass().getSimpleName());
		this.shape.draw();
	}
}