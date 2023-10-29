package teeTimeReservations;

import java.io.Serializable;

public class Member implements Serializable{
	int MemberNumber;
	String fname;
	String lname;
	
	String MemberStatus;
	
	static Member member = null;
	
	
	Member (int MemberNumber, String fname, String lname, String MemberStatus){
		this.MemberNumber = MemberNumber;
		this.fname  = fname;
		this.lname = lname;
		this.MemberStatus = MemberStatus;
	}
	
	public String toString() {
		return MemberNumber + " " + fname + " " + lname + " " + MemberStatus;
	}
	

	
		

}
