package dieterbaier.git.sandbox;

import dieterbaier.git.sandbox.greeting.Gender;
import dieterbaier.git.sandbox.greeting.Greeter;

/**
 * Line for commit1
 * Line for commit2
 */
public class Main {

  /**
   * @param args
   */
  public static void main(final String[] args) {
    System.out.println(Greeter.instance(Gender.male).sayHello("Baier"));
    System.out.println(Greeter.instance(Gender.female).sayHello("Baier"));
  }

}
