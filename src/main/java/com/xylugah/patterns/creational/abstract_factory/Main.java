package com.xylugah.patterns.creational.abstract_factory;

public class Main {

	public static void main(String[] args) {

		AbstractFactory shapeFactory = FactoryProducer.getFactory("SHAPE");
		Shape circle = shapeFactory.getShape("CIRCLE");
		Shape rectangle = shapeFactory.getShape("RECTANGLE");
		Shape square = shapeFactory.getShape("SQUARE");

		AbstractFactory colorFactory = FactoryProducer.getFactory("COLOR");
		Color red = colorFactory.getColor("RED");
		Color green = colorFactory.getColor("GREEN");
		Color blue = colorFactory.getColor("BLUE");

		circle.draw();
		rectangle.draw();
		square.draw();

		red.fill();
		green.fill();
		blue.fill();
	}

}
