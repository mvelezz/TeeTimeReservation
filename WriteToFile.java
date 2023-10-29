package teeTimeReservations;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.io.FileOutputStream;
import java.io.IOException;
public class WriteToFile {
	public void write(Member member, ArrayList array) throws IOException {
		FileOutputStream fos = new FileOutputStream ("MemberList.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(array);
		
		System.out.println("finish");
		
		oos.close();
		fos.close();
	}
}
