package in.sbp.exceptionhandling.classes;

public class MultiCatchDemo1 {
	public void printTable(int num) throws InterruptedException {
		for(int i=1;i<=10;i++) {
			Thread.sleep(100);
			System.out.println(i*num);
		}
	}

}
