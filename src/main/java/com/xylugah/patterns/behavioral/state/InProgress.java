package com.xylugah.patterns.behavioral.state;

public class InProgress extends State {

  protected InProgress(Task task) {
    super(task);
  }

  @Override
  void open() {
    System.out.println("Task was opened.");
    getTask().setState(getTask().getOpen());
  }

  @Override
  void startProgress() {
    System.out.println("Task already inProgress!");
  }

  @Override
  void resolve() {
    System.out.println("Task was resolved.");
    getTask().setState(getTask().getDone());
  }

  @Override
  public String toString() {
    return "Status: InProgress";
  }
}
