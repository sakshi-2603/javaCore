package in.sbp.exceptionhandling.classes;

public class MultiCatchDemo {
	
	
	private String message;
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	@Override
	public String toString() {            //toString - object class method
		return "message=" + message;
	}
	public void division(int num1,int num2) {
		System.out.println(num1/num2);
	}
	

}
//setter-mutater,getter-accesseser
//sourse+generate setter gettter = direct code of setandget