package in.sbp.exceptionhandling.classes;

public class ThrowDemo1 {
	public void division(int num1,int num2) {
		if(num2==0) 
			throw new ArithmeticException("second cannot be zero");
		else
			
		System.out.println("Division:"+(num1/num2));
	}
	public void setName(String name) {
		if(name.matches("[A-Z] [a-z]{2,14}"))
			System.out.println("valid name");
		else
			throw new RuntimeException("invalid date");
	}

}
