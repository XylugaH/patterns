package com.xylugah.patterns.creational.abstract_factory;

public class ShapeFactory extends AbstractFactory {

	@Override
	public Shape getShape(String shape) {
		if ("CIRCLE".equalsIgnoreCase(shape)) {
			return new Circle();
		}
		if ("RECTANGLE".equalsIgnoreCase(shape)) {
			return new Rectangle();
		}
		if ("SQUARE".equalsIgnoreCase(shape)) {
			return new Square();
		}
		return null;
	}

	@Override
	Color getColor(String color) {
		return null;
	}

}
