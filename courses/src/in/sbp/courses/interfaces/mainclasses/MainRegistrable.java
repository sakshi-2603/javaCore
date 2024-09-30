package in.sbp.courses.interfaces.mainclasses;
import in.sbp.courses.interfaces.*;
public class MainRegistrable {
	public static void main(String[] args) {
		Registrable java = 
				(payFees,coursename)-> {
					if(payFees> 10000) {
						System.out.println("register " + coursename);
						
					}else {
						System.out.println("not register "+coursename);
					}
					
				};
				Registrable python = 
						(payFees,coursename)-> {
							if(payFees> 20000) {
								System.out.println("register " + coursename);
								
							}else {
								System.out.println("not register "+coursename);
							}
							
						};
						Registrable cpp = 
								(payFees,coursename)-> {
									if(payFees> 30000) {
										System.out.println("register " + coursename);
										
									}else {
										System.out.println("not register "+coursename);
									}
									
								};
				java.displayMessage(20000,"java");
				python.displayMessage(20000,"python");
				cpp.displayMessage(20000,"cpp");
	}

}
