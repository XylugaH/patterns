package com.xylugah.patterns.structural.adapter;

public class Main {

  public static void main(String[] args) {
    USBPort usbPortAdapter = new USBToMicroUSBAdapter(new MicroUSBPort());
    usbPortAdapter.transmitData("data from USB port");
    usbPortAdapter.receiveData();

    MicroUSBPort microUSBPortAdapter = new MicroUSBToUSBAdapter(new USBPort());
    microUSBPortAdapter.transmitData("data from microUSB port");
    microUSBPortAdapter.receiveData();
  }

}
