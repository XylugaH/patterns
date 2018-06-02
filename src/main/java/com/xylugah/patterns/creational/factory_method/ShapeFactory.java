package com.xylugah.patterns.creational.factory_method;

public class ShapeFactory {

	public Shape getShape(String name) {
		if ("CIRCLE".equalsIgnoreCase(name)) {
			return new Circle();
		}
		if ("RECTANGLE".equalsIgnoreCase(name)) {
			return new Rectangle();
		}
		if ("SQUARE".equalsIgnoreCase(name)) {
			return new Square();
		}
		return null;
	}

}
