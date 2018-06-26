package com.xylugah.patterns.behavioral.iterator;

public class Main {

  public static void main(String[] args) {
    String[] testArray = {"one", "two", "three", "four"};
    Container<String> container = new ArrayContainer<>(testArray);

    for (Iterator iterator = container.getIterator(); iterator.hasNext(); ) {
      System.out.println(iterator.next());
    }
  }
}
