package com.xylugah.patterns.behavioral.mediator;

public interface Mediator {

  void addClient(Client client);

  void send(String message, Client client);

}
