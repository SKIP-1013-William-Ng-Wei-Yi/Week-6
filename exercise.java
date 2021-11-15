package exercise;
import java.util.Scanner;

public class exercise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num;
		System.out.println("Enter value :");
		
		Scanner scanMe = new Scanner (System.in);
		num = scanMe.nextInt();
		
		if (num%2 ==0)
			System.out.println("Even Number");
		
		else if (num%2 != 0)
			System.out.println("Odd Number");
		
		else
			System.out.println("Invalid");
		
	}
}
