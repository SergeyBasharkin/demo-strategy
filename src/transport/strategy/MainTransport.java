package transport.strategy;

import transport.strategy.checks.impl.AtmosphereCheck;
import transport.strategy.checks.impl.DefaultTrailerCheck;
import transport.strategy.checks.impl.NoEngineCheck;
import transport.strategy.checks.impl.R14WheelsCheck;
import transport.strategy.checks.impl.R16WheelsCheck;
import transport.strategy.checks.impl.TurboEngineCheck;

public class MainTransport {

  public static void main(String[] args) {
    Transport[] transport = new Transport[]{
        new Bicycle(new R16WheelsCheck()),
        new Bicycle(new R14WheelsCheck()),
        new Car(new R16WheelsCheck(), new NoEngineCheck()),
        new Car(new R16WheelsCheck(), new AtmosphereCheck()),
        new Truck(new R14WheelsCheck(),
            new TurboEngineCheck(),
            new DefaultTrailerCheck())
    };

    for (Transport transport1 : transport) {
      transport1.check();
    }
  }
}
