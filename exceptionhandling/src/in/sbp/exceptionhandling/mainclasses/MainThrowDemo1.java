package in.sbp.exceptionhandling.mainclasses;
import in.sbp.exceptionhandling.classes.*;
public class MainThrowDemo1 {
	public static void main(String[] args) {
		ThrowDemo1 throwDemo = new ThrowDemo1();
		throwDemo.division(0,1);
		
		try {
			throwDemo.setName("Abcd");
		}catch(RuntimeException e) {
			System.out.println();
		}
		
		System.out.println("continue...");
	}

}
