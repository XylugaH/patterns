package com.xylugah.patterns.structural.adapter;

public class USBToMicroUSBAdapter extends USBPort {

  private final MicroUSBPort microUSBPort;

  public USBToMicroUSBAdapter(MicroUSBPort microUSBPort) {
    this.microUSBPort = microUSBPort;
  }

  @Override
  public String receiveData() {
    return microUSBPort.receiveData();
  }

  @Override
  public void transmitData(String data) {
    microUSBPort.transmitData(data);
  }
}
