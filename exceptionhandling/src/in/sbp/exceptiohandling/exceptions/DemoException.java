package in.sbp.exceptiohandling.exceptions;
//for custom thir is mandatory exception name to every custom class name just like demo exception
public class DemoException extends RuntimeException{
	private static boolean enableSuppression;
	public DemoException() {
		super();
	}
	public DemoException(String message,Throwable cause ,boolean enableSuppresion,boolean writableStackTrace) {
		super(message,cause,enableSuppression,writableStackTrace);
	}
	

}
