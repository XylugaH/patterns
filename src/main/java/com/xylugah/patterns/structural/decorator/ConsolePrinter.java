package com.xylugah.patterns.structural.decorator;

public class ConsolePrinter implements Printer {

  @Override
  public void print(String msg) {
    System.out.println("Printed: " + msg);
  }
}
