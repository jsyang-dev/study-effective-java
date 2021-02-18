package item03;

import java.io.Serializable;

public class SingletonFactory implements Serializable {
  private static final SingletonFactory INSTANCE = new SingletonFactory();

  private SingletonFactory() {}

  public static SingletonFactory getInstance() {
    return INSTANCE;
  }

  protected Object readResolve() {
    return INSTANCE;
  }
}
