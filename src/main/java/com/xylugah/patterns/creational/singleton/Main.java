package com.xylugah.patterns.creational.singleton;

public class Main {

  public static void main(String[] args) {

    //Effective implementation for single threaded environment.
    SimpleSingleton simpleSingleton = SimpleSingleton.getInstance();

    //Effective thread safe implementation but it reduces the performance.
    ThreadSafeSingleton threadSafeSingleton =
        ThreadSafeSingleton.getInstance();

    //Effective thread safe implementation used for high volume systems.
    DoubleLockingThreadSafeSingleton doubleLockingThreadSafeSingleton =
        DoubleLockingThreadSafeSingleton.getInstance();
  }

}
