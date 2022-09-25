
 import java.util.Random;

public class Empwageuc1 {
	 
	public static void main(String[] args) {
		System.out.println("Welcome to Employee Wage Computation Program.");
		Random ran = new Random();
		int num = ran.nextInt(2);
		System.out.println("Random Number is : " + num);
		
		if(num == 1) 
			System.out.println("Employee is Present. ");
		else
			System.out.println("Employee is Absent. ");
		
	}

}