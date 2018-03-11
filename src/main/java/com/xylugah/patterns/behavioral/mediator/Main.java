package com.xylugah.patterns.behavioral.mediator;

public class Main {

  public static void main(String[] args) {

    //Create the mediator
    Mediator mediator = new MediatorImpl();

    //Create clients
    Client firstClient = new FirstClient(mediator);
    Client secondClient = new SecondClient(mediator);

    //Add clients to mediator
    mediator.addClient(firstClient);
    mediator.addClient(secondClient);

    //Send messages
    firstClient.send("Hello!");
    secondClient.send("Hi!");

  }
}
