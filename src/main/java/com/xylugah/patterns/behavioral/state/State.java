package com.xylugah.patterns.behavioral.state;

public abstract class State {

  private final Task task;

  protected State(Task task) {
    this.task = task;
  }

  public Task getTask() {
    return task;
  }

  abstract void open();

  abstract void startProgress();

  abstract void resolve();

}
