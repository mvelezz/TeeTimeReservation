package teeTimeReservations;
import java.util.Scanner;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.*;

public class Menu {
	
	static void menu() throws IOException, ClassNotFoundException{
		ArrayList<Member> MembersList = new ArrayList<>();
		ArrayList<Member> MembersInTeeTime = new ArrayList<>();
		int choice;
		LinkedHashMap<String, Member> TeeTimes = new LinkedHashMap<>();
		//Member memberHolder = new Member(0, "Empty", "Empty", "Empty");
		TeeTimes.put("6:00am", null);
		TeeTimes.put("7:00am", null);
		TeeTimes.put("8:00am", null);
		do {
			System.out.println("Please choose from the following");
			System.out.println("1. Reserve a Tee Time");
			System.out.println("2. Add a new Member to the system");
			System.out.println("3. View all members");
			System.out.println("4. Exit Program");
			
			Scanner scanner = new Scanner(System.in);
			
			choice = scanner.nextInt();
			
				switch(choice) {
				case 1:
					String teeTimeChoice;
					int memChoice = 0;
					for (String i: TeeTimes.keySet()) {
						System.out.println("Time: " + i + " Member: " + TeeTimes.get(i));
					}
					System.out.println("Which Tee Time would you like to reserve?");
					teeTimeChoice = scanner.next();
					for (String i : TeeTimes.keySet()) {
						if (teeTimeChoice.equals(i) ) {
							System.out.println("Which member do you want to add to the " + i + " tee time?");
							ReadFile reader = new ReadFile();
							reader.read();
							FileInputStream fis = new FileInputStream("MemberList.txt");
							ObjectInputStream ois = new ObjectInputStream(fis);
							
							ArrayList<Member> memberList = new ArrayList<>();
							memberList = (ArrayList<Member>) ois.readObject();
							memChoice = scanner.nextInt();
							
							for (Member myMember:memberList) {
								if (memChoice == myMember.MemberNumber) {
									TeeTimes.put(teeTimeChoice, myMember);
								}
								
							}
							for (String j : TeeTimes.keySet()) {
								System.out.println("Tee Time " + j + " Member " + TeeTimes.get(j));
							}
						}
					}
					
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
						
					Member member = new Member(MemberNumber, fname, lname, MemberStatus);
					
					
					
					MembersList.add(member);
					
					//System.out.println(MembersList);
					
					WriteToFile writer = new WriteToFile();
					
					writer.write(member, MembersList);
					
				case 3:
					ReadFile reader = new ReadFile();
					
					reader.read();
					
					}
					
			
						
				}
			while (choice != 4);
		}	
		
}


		
		//catch(InputMismatchException nfe) {
		//	System.out.println("Pleaste enter a valid number");
			
		//	}

			
			
		
		

	


	


