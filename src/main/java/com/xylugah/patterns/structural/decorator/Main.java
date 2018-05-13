package com.xylugah.patterns.structural.decorator;

public class Main {

  public static void main(String[] args) {
    Printer printer = new ToLowerCasePrinterDecorator(
        new LoggingPrinterDecorator(new ConsolePrinter()));
    printer.print("Hello world!!!");
  }

}
