package in.sbp.exceptionhandling.mainclasses;
import in.sbp.exceptionhandling.classes.*;
public class MainTypeMultiCatchDemo {
	public static void main(String[] args) {
		MultiCatchDemo obj = null;
		try {
			obj.division(10,0);
    	}catch(NullPointerException |ArithmeticException e) {
			System.out.println("obj is null");
		}
		catch(RuntimeException e) {
			//System.out.println(e.getMessage());
			e.printStackTrace();
		}
		
		
	}

}
//you can write multiple catch blocks to handle the exception
