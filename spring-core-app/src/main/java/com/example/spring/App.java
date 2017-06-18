package com.example.spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.example.spring.basicbeans.SpringShapeDrawing;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		// System.out.println( "Hello World!" );

		try (ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml")) {

			SpringShapeDrawing ssdCircle = (SpringShapeDrawing) context.getBean("drawingOfCircle");

			SpringShapeDrawing ssdTriangle = (SpringShapeDrawing) context.getBean("drawingOfTriangle");

			ssdCircle.drawShape();

			ssdTriangle.drawShape();
		}

	}
}
