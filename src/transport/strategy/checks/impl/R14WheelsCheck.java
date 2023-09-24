package transport.strategy.checks.impl;

import transport.strategy.checks.WheelsCheck;

public class R14WheelsCheck implements WheelsCheck {

  @Override
  public void check() {
    System.out.println("Проверка R14");
  }
}
