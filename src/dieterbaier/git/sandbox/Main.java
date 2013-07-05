package dieterbaier.git.sandbox;

import dieterbaier.git.sandbox.greeting.Gender;
import dieterbaier.git.sandbox.greeting.Greeter;

/**
 * Line for commitb1
 * Line for commitb2
 * Line for commitb3
 * Line for commitb4
 * Line for commitb5
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
