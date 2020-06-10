package ganiu_project;
import java.util.Scanner;
public class contest {
	
	public static void main(String[] args) {
		
		int num;
		int counter = 1;
		int largestNum = 0;
		
		for(int i = 1; i <= 10; i++) {
			
			Scanner input = new Scanner(System.in); 
			
			System.out.print("enter the num: ");
			
			num = input.nextInt();
			
			if (num > largestNum) {
				
				largestNum = num;
			}
			counter++;
		}
			 
			System.out.printf(" the largest num is:%d%n", largestNum );
		
	}

}