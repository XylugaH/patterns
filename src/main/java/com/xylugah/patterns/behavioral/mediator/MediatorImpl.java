package com.xylugah.patterns.behavioral.mediator;

import java.util.ArrayList;
import java.util.List;

public class MediatorImpl implements Mediator {

  private List<Client> clients;

  public MediatorImpl() {
    this.clients = new ArrayList<>();
  }

  public void addClient(Client client) {
    clients.add(client);
  }

  public void send(String message, Client provider) {
    for (Client current : clients) {
      if (current != provider) {
        current.receive(message, provider);
      }
    }
  }
}
