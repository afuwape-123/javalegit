package ganiu_project;
import java.util.Scanner;
public class MultipleBlock {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int sum = 0;
		
		for(int i = 2; i <= 20; i+= 2) {
			
			 sum = sum + i;
		
			 System.out.println(sum);
		} 
	}
}

                   