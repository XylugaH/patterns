package com.xylugah.patterns.behavioral.command;

public class TvOffCommand implements Command {

  private final TV tv;

  public TvOffCommand(TV tv) {
    this.tv = tv;
  }

  @Override
  public void execute() {
    tv.tvOff();
  }

}
