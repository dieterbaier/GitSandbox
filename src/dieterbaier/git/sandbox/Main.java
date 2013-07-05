package dieterbaier.git.sandbox;

import dieterbaier.git.sandbox.greeting.Gender;
import dieterbaier.git.sandbox.greeting.Greeter;

/**
 * Line for commitb1
 * Line for commitb2
 * Line for commitb3
 * Line for commitb4
 * Line for commitb5
 * Line for commitb6
 * Line for commitb7
 * Line for commitb8
 * Line for commitm1
 * Line for commitm2
 * Line for commitb9
 * Line for commitb10
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
