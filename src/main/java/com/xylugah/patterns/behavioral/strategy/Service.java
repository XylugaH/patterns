package com.xylugah.patterns.behavioral.strategy;

public class Service {

  private Logger logger;

  public Service(Logger logger) {
    this.logger = logger;
  }

  public void action() {
    logger.log("User action");
  }
}
