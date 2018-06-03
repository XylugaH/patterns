package com.xylugah.patterns.behavioral.command;

public class TvOnCommand implements Command {

  private final TV tv;

  public TvOnCommand(TV tv) {
    this.tv = tv;
  }

  @Override
  public void execute() {
    tv.tvOn();
  }

}
