package com.xylugah.patterns.behavioral.observer;

import java.util.ArrayList;
import java.util.List;

public class ObservableImpl implements Observable {

  private List<Observer> observers;

  public ObservableImpl() {
    this.observers = new ArrayList<>();
  }

  public void registerObserver(Observer observer) {
    observers.add(observer);
  }

  public void removeObserver(Observer observer) {
    if (observers.contains(observer)) {
      observers.remove(observer);
    }
  }

  public void notifyObservers() {
    for (Observer current : observers) {
      current.update();
    }
  }
}
