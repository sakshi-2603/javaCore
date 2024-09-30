package in.sbp.exceptionhandling.classes;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ExceptionDemo {
	public int division(int num1,int num2) {
		return num1/num2;
	}
	public void loadClass() {
		try {
		Class.forName("com.mysql.driver.MySqlDriver");   //load external class to jvm
		}catch(Exception e) {
			e.printStackTrace();
		         
		}
	}
	public Date formatDate(String bDay)throws ParseException {
		SimpleDateFormat format = new SimpleDateFormat("dd.mm.yy");
		return format.parse(bDay);
	}

}
