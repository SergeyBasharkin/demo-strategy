package transport.strategy.checks.impl;

import transport.strategy.checks.EngineCheck;

public class TurboEngineCheck implements EngineCheck {

  @Override
  public void check() {
    System.out.println("Проверка турбо двигателя");
  }
}
