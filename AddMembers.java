package teeTimeReservations;

import java.io.FileWriter;
import java.io.IOException;

public class AddMembers {{
    try {
        FileWriter myWriter = new FileWriter("Members List.txt");
        myWriter.write("Files in Java might be tricky, but it is fun enough!");
        myWriter.close();
        System.out.println("Successfully wrote to the file.");
      } catch (IOException e) {
        System.out.println("An error occurred.");
        e.printStackTrace();
      }
}} 
