package ganiu_project;
import java.util.Scanner;
public class ayomide{
	
public static void main(String[] args) {
		
		int counter = +1;
		int passed = 0;
		int failed = 0;
		
	
		while(counter <= 10) {
			
		System.out.print("enter the student result:");
		
		Scanner input = new Scanner(System.in);
	
		int result = input.nextInt();
		
		if(result >= 50) {
			System.out.println(result + ("P"));
			passed++;
		}
		
		else {
			System.out.println(result + ("F"));
			failed++;
		}
		counter++;
	}
		System.out.printf("passed:%d%n failed:%d%n",  passed ,failed);
	}
}