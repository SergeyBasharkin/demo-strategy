package transport.strategy;

import transport.strategy.checks.EngineCheck;
import transport.strategy.checks.WheelsCheck;
import transport.strategy.checks.impl.NoTrailerCheck;

public class Car extends Transport{

  public Car(WheelsCheck wheelsCheck, EngineCheck engineCheck) {
    super(wheelsCheck, engineCheck, new NoTrailerCheck(), "Машина");
  }
}
