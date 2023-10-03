package teeTimeReservations;

public class Member {
	int MemberNumber;
	String fname;
	String lname;
	
	String MemberStatus;
	
	static Member member = null;
	
	Member(){
		
	}
	
	Member (int MemberNumber, String fname, String lname, String MemberStatus){
		this.MemberNumber = MemberNumber;
		this.fname  = fname;
		this.lname = lname;
		this.MemberStatus = MemberStatus;
	}
	
	public void display() {
		System.out.println("Member Number is: " + MemberNumber + " " + "and name is " + fname + " " + lname);
		System.out.println();
	}
	

	
		

}
