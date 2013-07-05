package dieterbaier.git.sandbox.greeting;

public class FemaleGreeter extends Greeter {

  @Override
  protected String greet(final String name) {
    return new StringBuilder("Good morning Mrs. ").append(name).toString();
  }

}
