package com.xylugah.patterns.creational.abstract_factory;

public class FactoryProducer {

	public static AbstractFactory getFactory(String factory) {
		if ("COLOR".equalsIgnoreCase(factory)) {
			return new ColorFactory();
		}
		if ("SHAPE".equalsIgnoreCase(factory)) {
			return new ShapeFactory();
		}
		return null;
	}
	
}
