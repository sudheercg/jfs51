package java8enhancements.streamapi;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadCSVDemo {

	public static void main(String[] args) {

		String fileName = "myexpenses.csv";
		try {

			FileReader reader = new FileReader(fileName);
			BufferedReader br = new BufferedReader(reader);

			String line;
			while ((line = br.readLine()) != null) {
				String[] data = line.split(",");

				for (String value : data) {
					System.out.print(value + " | ");
				}
				System.out.println();

			}

		} catch (IOException io) {
			io.printStackTrace();
		}

	}

}
