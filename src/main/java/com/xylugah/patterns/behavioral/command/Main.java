package com.xylugah.patterns.behavioral.command;

public class Main {

  public static void main(String[] args) {
    LightLamp lamp = new LightLamp();
    LightOnCommand lightOn = new LightOnCommand(lamp);
    LightOffCommand lightOff = new LightOffCommand(lamp);

    TV tv = new TV();
    TvOnCommand tvOn = new TvOnCommand(tv);
    TvOffCommand tvOff = new TvOffCommand(tv);

    RemoteControl remoteControl = new RemoteControl(4);
    remoteControl.setCommand(0, lightOn);
    remoteControl.setCommand(1, lightOff);
    remoteControl.setCommand(2, tvOn);
    remoteControl.setCommand(3, tvOff);

    remoteControl.pushButton(0);
    remoteControl.pushButton(1);
    remoteControl.pushButton(2);
    remoteControl.pushButton(3);
  }
}
