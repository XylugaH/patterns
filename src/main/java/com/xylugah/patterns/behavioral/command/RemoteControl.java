package com.xylugah.patterns.behavioral.command;

public class RemoteControl {

  Command[] commands;

  public RemoteControl(int numberOfButtons) {
    commands = new Command[numberOfButtons];
    for (int i = 0; i < commands.length; i++) {
      commands[i] = new EmptyCommand();
    }
  }

  public void setCommand(int slot, Command command) {
    commands[slot] = command;
  }

  public void pushButton(int slot) {
    commands[slot].execute();
  }
}
