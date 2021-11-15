package exercise;
import java.util.Scanner;

public class bmiCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double weight,height,bmi;
		
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter your height in (cm) : ");
		height = sc.nextDouble();
		
		System.out.println("Enter your weight in (kg) : ");
		weight = sc.nextDouble();
		
		bmi = (weight/(height*height))*10000;
		
		if (bmi>=18.5 && bmi<=24.9)
			System.out.printf("Healthy, BMI = %.2f",bmi);
		
		else if(bmi>=25.0 && bmi<=29.9)
			System.out.printf("OverWeight, BMI = %.2f",bmi);
		
		else if (bmi<18.5)
			System.out.printf("Underweight, BMI = %.2f",bmi);
		
		else 
			System.out.printf("Overweight, BMI = %.2f",bmi);
		
		
	}

}
