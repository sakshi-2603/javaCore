package in.sbp.overriding.MainOverriding;
import in.sbp.overriding.subclass.*;
import in.sbp.overriding.superclass.*;
public class MainChildParent {
	public static void main(String[] args) {
		Parent obj1 = new Parent();
		Child obj2 = new Child();
		obj1.wakeUp();
		obj2.sleep();
		obj2.wakeUp();
		
	}

}
