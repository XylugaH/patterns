package com.xylugah.patterns.behavioral.mediator;

public class SecondClient extends Client {

  public SecondClient(Mediator mediator) {
    super(mediator);
  }

  public void receive(String message, Client client) {
    System.out.println(
        this.getClass().getName() + " received message " + message + " from client " + client);
  }
}
