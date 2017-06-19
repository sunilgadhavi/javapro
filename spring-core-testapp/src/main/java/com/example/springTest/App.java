package com.example.springTest;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.example.springTest.basicbeans.SpringShapeDrawing;



/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	try (ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml")) {

			SpringShapeDrawing ssdCircle = (SpringShapeDrawing) context.getBean("drawingOfCircle");

			SpringShapeDrawing ssdTriangle = (SpringShapeDrawing) context.getBean("drawingOfTriangle");

			ssdCircle.drawShape();

			ssdTriangle.drawShape();
		}
    }
}
