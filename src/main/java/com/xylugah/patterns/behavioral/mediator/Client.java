package com.xylugah.patterns.behavioral.mediator;

public abstract class Client {

  private final Mediator mediator;

  public Client(Mediator mediator) {
    this.mediator = mediator;
  }

  public void send(String message) {
    mediator.send(message, this);
  }

  public abstract void receive(String message, Client client);

  public Mediator getMediator() {
    return mediator;
  }
}
