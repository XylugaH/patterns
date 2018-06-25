package com.xylugah.patterns.behavioral.strategy;

public class FileLogger implements Logger {

  @Override
  public void log(String msg) {
    System.out.println("Logged to file: " + msg);
  }
}
