package teeTimeReservations;

import java.io.File;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.InputMismatchException;

public class Main {

	public static void main(String[] args) throws IOException, ClassNotFoundException{
			Menu.menu();
		/*		String url = "jdbc:mysql://localhost:3306/members";
				String username = "root";
				try {
					Class.forName("com.mysql.cj.jdbc.Driver");
					
					Connection connection = DriverManager.getConnection(url, username, "SARAHANDMIAH@2019");
					
					Statement statement = connection.createStatement();
					
					ResultSet resultSet = statement.executeQuery("select * from members");
					
					while(resultSet.next()) {
						System.out.println(resultSet.getInt(1) + " " + resultSet.getString(2) + " " + resultSet.getString(3));
					}
					
					connection.close();
					
				}
				catch(Exception e) {
					System.out.println(e);
				}*/
			

	}
	

}
