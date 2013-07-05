package dieterbaier.git.sandbox.greeting;

public abstract class Greeter {

  public static Greeter instance(final Gender gender) {
    switch (gender) {
      case female:
        return new FemaleGreeter();
      case male:
        return new MaleGreeter();
      default:
        return new DefaultGreeter();
    }
  }

  public String sayHello(final String name) {
    return greet(name);
  }

  protected abstract String greet(final String name);

}
