package task;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class WriteCSVDemo {
	
	public static void main(String[] args) {
		
		String fileName ="myexpenses.csv";
		
		try(FileWriter fw =new FileWriter(fileName);
			BufferedWriter bw = new BufferedWriter(fw))
		{
			bw.write("Description,Amount,Category");
			bw.newLine();
			
			bw.write("Lunch,150,Food");
			bw.newLine();
			
			bw.write("Movie Ticket,200,Entertainment");
			bw.newLine();
			
			bw.write("Course Fee,50000,Education");
			bw.newLine();
			
			System.out.println("CSV file written successfully");
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
	}

}
