package in.sbp.overriding.subclass;
import in.sbp.overriding.superclass.*;
public class Child extends Parent {   //overriding parent class
	                                  //child class visibility is more campare to parent classi.e access specifier
	                                  //method can be override in child class only
	public void sleep() {
		System.out.println("Child sleep @03:00 AM");

	}
	public void wakeUp(int number) {
		System.out.println("Child wake up @10:00 AM");
	}

}
