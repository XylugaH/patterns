package com.xylugah.patterns.behavioral.observer;

public class SecondObserverImpl implements Observer {

  public void update() {
    System.out.println(this.getClass().getName() + " I've got new update");
  }
}
