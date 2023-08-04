package teeTimeReservations;
import java.util.Scanner;

public class Menu {
	
	static void menu() {
		System.out.println("Please choose from the following");
		System.out.println("1. Reserve a Tee Time");
		System.out.println("2. Add a new Member");
		System.out.println("3. View all members");
		
		Scanner Inputobj = new Scanner(System.in);
		
		 
		int Input = Inputobj.nextInt(); 
		
		
		if (Input == 1) {
			System.out.println("Made it to 1");
			}
		
		if (Input ==2) {
			Members newMember1 = new Members();
			System.out.println("Please enter Member Information: ");
			System.out.println("Please enter the new Member Number");
			int memNumInput = Inputobj.nextInt();
			newMember1.MemberNumber = memNumInput;
			System.out.println(newMember1.MemberNumber);
			
			
		}
	}
	

}
