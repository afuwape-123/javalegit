package ganiu_project;
import java.util.Scanner;
public class SecondSalary {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		double grossSales = 0.0;
		double salary = 0.0;
		int itemsSold = 0;	
		
		
		while(true) {
			
			
			System.out.print("the item1 sold: ");
			int item1 = input.nextInt();
			
			System.out.print("the item2 sold: ");
			int item2 = input.nextInt();
			
			System.out.print("the item3 sold: ");
			int item3 = input.nextInt();
			
			System.out.print("the item4 sold: ");
			int item4 = input.nextInt();

			double valueA = item1 * 239.99;
			double valueB = item2 * 129.75;
			double valueC = item3 * 99.95;
			double valueD = item4 * 350.89;
			
			grossSales = valueA + valueB + valueC + valueD;
		
		
			salary = 200 + (0.09 * grossSales);
		
		 System.out.println();
		 System.out.printf("the weekly salary is: %.2f%n", salary);
		 System.out.println();
		 System.out.print("Enter the item1 sold: ");
		 item1 = input.nextInt();
		 if(item1 == -1) {
			 break;
		 }
			}
		} 
		
			
		
		
		
	

	
	}

