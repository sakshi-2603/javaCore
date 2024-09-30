package in.sbp.exceptionhandling.trycatch;

public class TryCatch {
	public static void main(String[] args) {
		int[] arr = {1,2,3,4};
		try {
			for(int i=0;i<=arr.length;i++)
				System.out.println(arr[i]);
		}catch(RuntimeException e) {
			System.out.println("yoc can write catch block here");
		}
		finally {
			System.out.println("this is finally block");
		}System.out.println("byeeeeeeeeeeeeee...");
	}

}
