package com.xylugah.patterns.behavioral.state;

public class Done extends State {

  protected Done(Task task) {
    super(task);
  }

  @Override
  void open() {
    System.out.println("Task was opened");
    getTask().setState(getTask().getOpen());
  }

  @Override
  void startProgress() {
    System.out.println("Task in progress");
    getTask().setState(getTask().getInProgress());
  }

  @Override
  void resolve() {
    System.out.println("Task already resolved");
  }

  @Override
  public String toString() {
    return "Status: Done";
  }
}
