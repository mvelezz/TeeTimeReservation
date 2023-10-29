package teeTimeReservations;

import java.io.File;
import java.util.Scanner;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

public class ReadFile {
	public void read() throws IOException, ClassNotFoundException {
		FileInputStream fis = new FileInputStream("MemberList.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);
		
		ArrayList<Member> memberList = new ArrayList<>();
		memberList = (ArrayList<Member>) ois.readObject();
		
		for (Member myMember:memberList) {
			System.out.println(myMember);
		}
	}
}
