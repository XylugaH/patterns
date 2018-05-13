package com.xylugah.patterns.structural.decorator;

public class LoggingPrinterDecorator implements Printer {

  private final Printer printer;

  public LoggingPrinterDecorator(Printer printer) {
    this.printer = printer;
  }

  @Override
  public void print(String msg) {
    log(msg);
    printer.print(msg);
  }

  private void log(String msg) {
    System.out.println("Logged message: " + msg);
  }
}
