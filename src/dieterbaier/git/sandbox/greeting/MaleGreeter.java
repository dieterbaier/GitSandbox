package dieterbaier.git.sandbox.greeting;

public class MaleGreeter extends Greeter {

  @Override
  protected String greet(final String name) {
    return new StringBuilder("God morning Mr. ").append(name).toString();
  }

}
