package ganiu_project;
import java.util.Scanner;

public class combine {
	
	public static void main(String[] args) {
		
		int trips = 0;
		int md = 0 ;
		int gu = 0;
		double mpg = 0;
		int tmd = 0;
		int tgu = 0;
		double tmpg = 0;
		
		Scanner input = new Scanner(System.in);

		System.out.print("Enter the miles driven: ");
	

		md = input.nextInt();
		
		while(md != 0) {
			System.out.print("Enter miles per gallon: ");

			gu = input.nextInt();
			
			mpg = (double) md/gu;
			
			System.out.print("Enter the next miles driven: ");
			md = input.nextInt();
			
			tmd += md;
			
			tgu += gu;
			
			trips++;

		}
		tmpg = (double) tmd/tgu;
		System.out.print("total miles per gallon: " + tmpg);
	}

}
