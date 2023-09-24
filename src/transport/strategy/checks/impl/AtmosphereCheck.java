package transport.strategy.checks.impl;

import transport.strategy.checks.EngineCheck;

public class AtmosphereCheck implements EngineCheck {

  @Override
  public void check() {
    System.out.println("Проверка атмосферного двигателя");
  }
}
