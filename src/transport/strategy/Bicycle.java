package transport.strategy;

import transport.strategy.checks.WheelsCheck;
import transport.strategy.checks.impl.NoEngineCheck;
import transport.strategy.checks.impl.NoTrailerCheck;

public class Bicycle extends Transport{

  public Bicycle(WheelsCheck wheelsCheck) {
    super(wheelsCheck, new NoEngineCheck(), new NoTrailerCheck(), "Велосипед");
  }
}
