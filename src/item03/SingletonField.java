package item03;

import java.io.Serializable;

public class SingletonField implements Serializable {
  public static final SingletonField INSTANCE = new SingletonField();

  private SingletonField() {}

  protected Object readResolve() {
    return INSTANCE;
  }
}
