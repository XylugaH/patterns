package com.xylugah.patterns.structural.adapter;

public class USBPort {

  public String receiveData() {
    String data = "Data from USB";
    System.out.println("USBPort received data: " + data);
    return data;
  }

  public void transmitData(String data) {
    System.out.println("USBPort got data: " + data);
  }

}
