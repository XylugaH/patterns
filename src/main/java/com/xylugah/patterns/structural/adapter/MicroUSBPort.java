package com.xylugah.patterns.structural.adapter;

public class MicroUSBPort {

  public String receiveData() {
    String data = "Data from MicroUSB";
    System.out.println("MicroUSBPort received data: " + data);
    return data;
  }

  public void transmitData(String data) {
    System.out.println("MicroUSBPort got data: " + data);
  }
}
