package com.xylugah.patterns.behavioral.command;

public class LightOffCommand implements Command {

  private final LightLamp lamp;

  public LightOffCommand(LightLamp lamp) {
    this.lamp = lamp;
  }

  @Override
  public void execute() {
    lamp.off();
  }

}
