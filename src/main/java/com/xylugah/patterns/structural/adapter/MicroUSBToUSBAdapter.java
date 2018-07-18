package com.xylugah.patterns.structural.adapter;

public class MicroUSBToUSBAdapter extends MicroUSBPort {

  private final USBPort USBPort;

  public MicroUSBToUSBAdapter(USBPort USBPort) {
    this.USBPort = USBPort;
  }

  @Override
  public String receiveData() {
    return USBPort.receiveData();
  }

  @Override
  public void transmitData(String data) {
    USBPort.transmitData(data);
  }
}
