package transport.strategy;

import transport.strategy.checks.EngineCheck;
import transport.strategy.checks.TrailerCheck;
import transport.strategy.checks.WheelsCheck;

public class Truck extends Transport{

  public Truck(WheelsCheck wheelsCheck,
      EngineCheck engineCheck,
      TrailerCheck trailerCheck) {
    super(wheelsCheck, engineCheck, trailerCheck, "Грузовик");
  }
}
