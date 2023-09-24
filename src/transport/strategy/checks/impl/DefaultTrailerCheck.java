package transport.strategy.checks.impl;

import transport.strategy.checks.TrailerCheck;

public class DefaultTrailerCheck implements TrailerCheck {

  @Override
  public void check() {
    System.out.println("Проверка трейлера");
  }
}
