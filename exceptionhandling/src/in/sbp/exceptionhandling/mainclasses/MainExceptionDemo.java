package in.sbp.exceptionhandling.mainclasses;
import java.text.ParseException;

import in.sbp.exceptionhandling.classes.*;
public class MainExceptionDemo {
	public static void main(String[] args)throws ParseException {
		ExceptionDemo demo = new ExceptionDemo();
		demo.division(10, 0);
		demo.loadClass();
		try {
			System.out.println(demo.formatDate("22.01.2024"));
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		
	}

}
