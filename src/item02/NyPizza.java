package item02;

public class NyPizza extends Pizza {
  public enum Size {
    SMALL,
    MEDIUM,
    LARGE
  }

  private final Size size;

  public static class Builder extends Pizza.Builder<Builder> {
    private final Size size;

    // 필수값
    private Builder(Size size) {
      this.size = size;
    }

    @Override
    NyPizza build() {
      return new NyPizza(this);
    }

    @Override
    protected Builder self() {
      return this;
    }
  }

  public static Builder builder(Size size) {
    return new NyPizza.Builder(size);
  }

  NyPizza(Builder builder) {
    super(builder);
    this.size = builder.size;
  }

  @Override
  public String toString() {
    return "NyPizza{" + "size=" + size + ", toppings=" + toppings + '}';
  }
}
