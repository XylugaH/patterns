package com.xylugah.patterns.behavioral.state;

public class Task {

  private State open;
  private State inProgress;
  private State done;

  private State state;

  public Task() {
    this.open = new Open(this);
    this.inProgress = new InProgress(this);
    this.done = new Done(this);
    this.state = open;
  }

  public State getOpen() {
    return open;
  }

  public State getInProgress() {
    return inProgress;
  }

  public State getDone() {
    return done;
  }

  public State getState() {
    return state;
  }

  public void setState(State state) {
    this.state = state;
  }

  public void open() {
    this.state.open();
  }

  public void startProgress() {
    this.state.startProgress();
  }

  public void resolve() {
    this.state.resolve();
  }

}
