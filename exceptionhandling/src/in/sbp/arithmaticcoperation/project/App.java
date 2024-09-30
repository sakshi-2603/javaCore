package in.sbp.arithmaticcoperation.project;

import java.util.Scanner;

public class App {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int choice=0;
		do {
			System.out.println("enter your choice:");
			System.out.println("------------------");
			System.out.println("1.Addition");
			System.out.println("2.Substraction");
			System.out.println("3.Multiplication");
			System.out.println("4.Division");
			System.out.println("0. Exit");
			switch(choice) {
			case 0:System.out.println("Enter your choice: ");
			case 1:System.out.println("1.Addition");
			case 2:System.out.println("2.Substraction");
			case 3:System.out.println("3.Multiplication");
			case 4:System.out.println("4.division");
			
			
			default: System.out.println("Invalid input");
			}
			
		}
		while(choice!=0);
		System.out.println("Enter the first no");
		int num1=sc.nextInt();
		System.out.println("Enter the second no");
		int num2=sc.nextInt();
		int add = num1+num2;
		System.out.println("The addition is:"+add);
		int sub = num1-num2;
		System.out.println("The substraction is:"+sub);
		int multi = num1*num2;
		System.out.println("The multiplication is:"+multi);
		sc.close();
	}

}

