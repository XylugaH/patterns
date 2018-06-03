package com.xylugah.patterns.behavioral.command;

public class LightOnCommand implements Command {

  private final LightLamp lamp;

  public LightOnCommand(LightLamp lamp) {
    this.lamp = lamp;
  }

  @Override
  public void execute() {
    lamp.on();
  }

}
