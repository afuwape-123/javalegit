package ganiu_project;
import java.security.SecureRandom;
public class RandomInteger{
	
	public static void main(String[] args) {
		
	/*	SecureRandom input = new SecureRandom();
		
		for(int counter = 1; counter <= 20; counter++) {
			
			int dice = 1 + input.nextInt(6);
			
			System.out.printf("%d   ", dice);
			
			if(counter % 5 == 0)
				System.out.println();*/
		
		SecureRandom randomNumber = new SecureRandom();
		
		int control1 = 0, control2 = 0, control3 = 0, control4 = 0, control5 = 0, control6 = 0;
		
		for(int roll = 1; roll <= 6000000; roll++) {
			
			int face = 1 + randomNumber.nextInt(6);
			
			switch(face) {
			
			case 1:
				++control1;
				break;
				
			case 2:
				++control2;
				break;
				
			case 3:
				++control3;
				break;
				
			case 4:
				++control4;
				break;
				
			case 5:
				++control5;
				break;
				
			case 6:
				++control6;
				break;
			}
				
			}
		System.out.println("gface/face");
		System.out.printf("1/g%d%n2/g%d%n3/g%d%n4/g%d%n5/g%d%n6/g%d%n", control1, control2, control3, control4, control5, control6);
		
	
	}
}