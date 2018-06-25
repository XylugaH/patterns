package com.xylugah.patterns.behavioral.state;

public class Open extends State {

  protected Open(Task task) {
    super(task);
  }

  @Override
  void open() {
    System.out.println("Task already opened");
  }

  @Override
  void startProgress() {
    System.out.println("Start progress...");
    getTask().setState(getTask().getInProgress());
  }

  @Override
  void resolve() {
    System.out.println("You can't resolve opened task");
  }

  @Override
  public String toString() {
    return "Status: Open";
  }
}
