package com.xylugah.patterns.creational.singleton;

public class DoubleLockingThreadSafeSingleton {

  private static DoubleLockingThreadSafeSingleton instance;

  private DoubleLockingThreadSafeSingleton() {
  }

  public static DoubleLockingThreadSafeSingleton getInstance() {
    if (instance == null) {
      synchronized (ThreadSafeSingleton.class) {
        if (instance == null) {
          instance = new DoubleLockingThreadSafeSingleton();
        }
      }
    }
    return instance;
  }
}
