package dieterbaier.git.sandbox.greeting;

class DefaultGreeter extends Greeter {

  @Override
  protected String greet(final String name) {
    return new StringBuilder("Hello").append(" ").append(name).toString();
  }

}
