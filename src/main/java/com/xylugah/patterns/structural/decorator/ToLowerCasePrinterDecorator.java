package com.xylugah.patterns.structural.decorator;

public class ToLowerCasePrinterDecorator implements Printer {

  private final Printer printer;

  public ToLowerCasePrinterDecorator(Printer printer) {
    this.printer = printer;
  }

  @Override
  public void print(String msg) {
    msg = toLowerCase(msg);
    printer.print(msg);
  }

  private String toLowerCase(String msg) {
    System.out.println("Converted to lower case message " + msg);
    return msg.toLowerCase();
  }
}
