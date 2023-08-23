import java.util.*;

public class Dwbiadda_BMI_Calculator {

	public static void main(String[] args)
	{
		System.out.println("Program to check BMI(Body Mass Index)");
		System.out.println("=====================================");
		Scanner s =new Scanner(System.in);
		System.out.println("Enter Choice '1' if you know only height - meter, Weight - kg");
		System.out.println("Enter Choice '2' if you know only height - feet/inches, Weight - pound");
        int choice=s.nextInt();
        double weight=0;
        double height=0;
        switch(choice)
        {
        case 1:
        {
        	System.out.print("Enter height(meter) - "); 
        	height=s.nextDouble();
        	System.out.print("\nEnter weight(Kg) - ");
        	 weight=s.nextDouble();
        	break;
        }
        case 2:
        {
        	System.out.print("Enter height(feet) - ");
        	double ft=s.nextDouble();
        	System.out.print("Enter height(inches) - ");
        	double inches=s.nextDouble();
           	// 1 feet =12 inches
        	inches=inches+(12*ft);
        	//1 inches = 0.0254 m
        	height= inches*0.0254;
        	// 1 pound = 0.45359 kg
        	System.out.print("\nEnter weight(pound) - ");
        	double pound=s.nextDouble();
        	weight=(pound*0.45359);
        	break;
        }
        default:
        {
        	System.out.println("Invalid input!! please enter either 1 or 2 as choice..");
        	break;
        }
        }
        if(height !=0.0 && weight != 0.0)
        {
        	System.out.println("*******************");
        	double bmi=weight / (height*height);
        	System.out.println("BMI Value:"+bmi);
        	if(bmi<18.5)
        	{
        		System.out.println("BMI value is less than 18.5. So, you are 'underweight'");
        		System.out.println("Please take care of your weight to improve your health!!");
        	}
        	if(bmi>=18.5 && bmi<=24.9)
        	{
        		System.out.println("BMI value is between 18.5 and 24.9 . So,you are 'normal weight'");
        		System.out.println("Congratz!! your weight and height is perfect");
        		
        	}
        	if(bmi>=25.0 && bmi<=29.9)
        	{
        	System.out.println("BMI value is less than 25.0 and 29.9. So,you are 'overweight'");
        	System.out.println("Please take care of your diet plan!!");
        	}
        	if(bmi>=30.0)
        	{
        	System.out.println("BMI value is greater than 30.0 . So,you are 'obese' ");
        	System.out.println("Do proper physical movements. Regular excercise may keep you fit!!Cheer up..");
        	}
        	System.out.println("*******************");
        }
	}
}