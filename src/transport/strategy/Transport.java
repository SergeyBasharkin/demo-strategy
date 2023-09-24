package transport.strategy;

import transport.strategy.checks.EngineCheck;
import transport.strategy.checks.TrailerCheck;
import transport.strategy.checks.WheelsCheck;

public abstract class Transport {

  private WheelsCheck wheelsCheck;
  private EngineCheck engineCheck;
  private TrailerCheck trailerCheck;

  private final String name;

  public Transport(WheelsCheck wheelsCheck, EngineCheck engineCheck, TrailerCheck trailerCheck,
      String name) {
    this.wheelsCheck = wheelsCheck;
    this.engineCheck = engineCheck;
    this.trailerCheck = trailerCheck;
    this.name = name;
  }

  public void check(){
    System.out.println("==========================");
    System.out.println("Проверка " + name);
    wheelsCheck();
    engineCheck();
    trailerCheck();
    System.out.println("==========================");
  }

  public void wheelsCheck(){
    wheelsCheck.check();
  }

  public void engineCheck(){
    engineCheck.check();
  }

  public void trailerCheck(){
    trailerCheck.check();
  }

}
