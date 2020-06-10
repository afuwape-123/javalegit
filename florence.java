package ganiu_project;
import java.util.Scanner;
public class florence{
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int counter = 1;
		int F = 0;
		int P = 0;
		
		while(counter <= 10) {
			
			System.out.print("Enter the student score :");
			
			int score = input.nextInt();
			
			if(score >= 50) {
				System.out.println(score +("P"));
			P++;
			}	
			
			else {
				System.out.println(score +("F"));
			F++;
			}
			counter++;
			}
		System.out.printf("Total no of students passed is: %d%n", P);
		System.out.printf("Total no of students failed is: %d%n", F);
	}
}
