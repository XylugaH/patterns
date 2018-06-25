package com.xylugah.patterns.behavioral.strategy;

public class ConsoleLogger implements Logger {

  @Override
  public void log(String msg) {
    System.out.println("Logged to console: " + msg);
  }
}
