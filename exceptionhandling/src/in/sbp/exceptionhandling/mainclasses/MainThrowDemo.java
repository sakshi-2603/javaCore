package in.sbp.exceptionhandling.mainclasses;
import java.text.ParseException;
import in.sbp.exceptionhandling.classes.*;
public class MainThrowDemo {
	public static void main(String[] args) {
		ThrowDemo obj = new ThrowDemo();
		try {
			System.out.println(obj.getDate("2024.10.26"));
		}
		catch(ParseException e) {
			System.out.println("invalid date format");
			e.printStackTrace();
		}
	}

}
