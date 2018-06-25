package com.xylugah.patterns.behavioral.strategy;

public class Main {

  public static void main(String[] args) {
    Service service1 = new Service(new ConsoleLogger());
    service1.action();
    Service service2 = new Service(new FileLogger());
    service2.action();
  }
}
