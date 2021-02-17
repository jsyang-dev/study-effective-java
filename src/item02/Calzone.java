package item02;

public class Calzone extends Pizza {
  private final boolean sauceInside;

  public static class Builder extends Pizza.Builder<Builder> {
    private boolean sauceInside = false;

    private Builder() {}

    public Builder sauceInside() {
      sauceInside = true;
      return this;
    }

    @Override
    Calzone build() {
      return new Calzone(this);
    }

    @Override
    protected Builder self() {
      return this;
    }
  }

  public static Builder builder() {
    return new Builder();
  }

  public Calzone(Builder builder) {
    super(builder);
    this.sauceInside = builder.sauceInside;
  }

  @Override
  public String toString() {
    return "Calzone{" + "sauceInside=" + sauceInside + ", toppings=" + toppings + '}';
  }
}
