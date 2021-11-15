package exercise;
import java.util.Scanner;

public class exercise1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String sub1, sub2;
		int mark1, mark2;
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Enter Subject 1 : ");
		sub1 = sc.next();
		System.out.println("Enter the mark of Subject 1 : ");
		mark1 = sc.nextInt();
		
		System.out.println("Enter Subject 2 : ");
		sub2 = sc.next();
		System.out.println("Enter the mark of Subject 2 : ");
		mark2 = sc.nextInt();
		
		if (mark1 > mark2)
		{
			System.out.println("Your " +sub1+" Score higher than "+sub2);
		}
		
		else if (mark2 > mark1)
		{
			System.out.println("Your " +sub2+" Score higher than "+sub1);
		}
		
		if (mark1 > 50)
		{
			System.out.println("Your "+sub1+" is pass !");
		}
		
		else if (mark1 < 50)
		{
			System.out.println("Your "+sub1+" is failed !");
		}
		
		if (mark2 > 50)
		{
			System.out.println("Your "+sub2+" is pass !");
		}	
		
		else if (mark2 < 50)
		{
			System.out.println("Your "+sub2+" is failed !");
		}
		
		double avg = ((mark1+mark2)/2);
		
		if (avg>=80 && avg<=100)
		{
			System.out.println("Gread A");
		}
		else if (avg>=60 && avg<=79)
		{
			System.out.println("Gred B");
		}
		else if (avg>=50 && avg<=59)
		{
			System.out.println("Gred C");
		}
		else
			System.out.println("Failed");
	}

}
