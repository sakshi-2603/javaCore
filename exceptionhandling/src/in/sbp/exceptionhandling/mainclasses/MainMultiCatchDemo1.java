package in.sbp.exceptionhandling.mainclasses;
import in.sbp.exceptionhandling.classes.*;
public class MainMultiCatchDemo1 {
	public static void main(String[] args) throws InterruptedException {
		MultiCatchDemo1 obj = new MultiCatchDemo1();
		try {
			obj.printTable(2);
		
		}catch(InterruptedException e) {
			e.printStackTrace();
			
		}
		catch(NullPointerException e){
			System.out.println("Null");
		
	}
		System.out.println("new null");

}
}