package in.sbp.classes;

public class Car {
    private int speed;
    private int steering;
    public Car() {
    	
    }
    public Car(int sp) {
    	speed = sp;
    }
    public Car (int sp,int str) {
//    	if (sp>90) {
//    		System.out.println("the angle is right");
//    	}else {
//    		System.out.println("the angle is left");
//    	}
    	
    }
//    public Car (int str) {
//    	steering +=90;
//    	System.out.println("right");
//    	
//    }
    public void accelarate() {
    	speed +=5;
    }
    public void applyBreak() {
    	speed -=20;
    }
    public void printDetails() {
    	System.out.println("Current Speed "+speed + "the angle is "+steering);
    }
}
