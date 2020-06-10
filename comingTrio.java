package ganiu_project;
import java.util.Scanner;
public class comingTrio {
	
	public static void main(String[] args) {
		
	int studentCounter = +1;
	
	int passed = 0;
	
	int failed = 0;
	
	Scanner input = new Scanner(System.in);
	
	while(studentCounter <= 10) {
		
		System.out.print("enter result(1 = passed, 2 = failed):");
		
		int result = input.nextInt();
		
	if(result == 1)
		
		passed = passed + 1;
	
	else
		failed = failed + 1;
	
	studentCounter = studentCounter + 1;
	}
	
	System.out.printf("passed: %d%n, failed: %d%n", passed, failed );
	
	if(passed >= 8)
		
		System.out.println("bonus to the instructor");
	}
}
