package com.xylugah.patterns.behavioral.observer;

public class Main {

  public static void main(String[] args) {
    //Create observable instance
    Observable observable = new ObservableImpl();

    //Create observer instances
    Observer firstObserver = new FirstObserverImpl();
    Observer secondObserver = new SecondObserverImpl();

    //Register observers
    observable.registerObserver(firstObserver);
    observable.registerObserver(secondObserver);

    //Notify all observers
    observable.notifyObservers();

    //Remove observer
    observable.removeObserver(firstObserver);

    //Notify all observers
    observable.notifyObservers();
  }

}
