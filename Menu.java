package teeTimeReservations;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.InputMismatchException;

public class Menu extends Member {
	
	static ArrayList<Member> MembersList = new ArrayList<>();
	
	Hashtable<Integer, String> memberDataBase = new Hashtable<>();
	
	static void menu() {
		System.out.println("Please choose from the following");
		System.out.println("1. Reserve a Tee Time");
		System.out.println("2. Add a new Member");
		System.out.println("3. View all members");
		System.out.println("4. Exit Program");
		
		Scanner scanner = new Scanner(System.in);
		
		int choice = scanner.nextInt();
		
		//try {
		while (choice != 4) {
			switch(choice) {
			case 1:
				System.out.println("Made it to reserve tee time: ");
				break;
			case 2:
				System.out.println("Please enter the members ID");
				int MemberNumber = scanner.nextInt();
				
				System.out.println("Please enter the members first name");
				String fname = scanner.next();					
				System.out.println("Please Enter the members Last Name");
				String lname = scanner.next();
					
				System.out.println("Please enter the members Status");
				String MemberStatus = scanner.next();
					
				member = new Member(MemberNumber, fname, lname, MemberStatus);					
				MembersList.add(member);
					
				for (int i = 0;i < MembersList.size(); i++) {
						System.out.print("The members number is ");
						System.out.println(MembersList.get(i).MemberNumber);
						System.out.print("Fname = ");
						System.out.println(MembersList.get(i).fname);
					
					}
					
				
		
					
			}
			System.out.println("Please choose from the following");
			System.out.println("1. Reserve a Tee Time");
			System.out.println("2. Add a new Member");
			System.out.println("3. View all members");
			System.out.println("4. Exit Program");
			
			choice = scanner.nextInt();
		}

		}
		
		//catch(InputMismatchException nfe) {
		//	System.out.println("Pleaste enter a valid number");
			
		//	}

			
			
		
		

	}

	


