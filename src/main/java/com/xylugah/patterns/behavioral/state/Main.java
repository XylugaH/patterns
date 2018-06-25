package com.xylugah.patterns.behavioral.state;

public class Main {

  public static void main(String[] args) {
    Task task = new Task();
    printCurrentState(task);
    task.open();
    task.resolve();
    task.startProgress();
    printCurrentState(task);
    task.startProgress();
    task.resolve();
    printCurrentState(task);
  }

  private static void printCurrentState(Task task) {
    System.out.println(task.getState());
  }
}
