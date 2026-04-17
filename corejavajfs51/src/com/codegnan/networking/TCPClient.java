package com.codegnan.networking;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class TCPClient {
	
	public static void main(String[] args) {
		
		
		
		
		try {
			//step1: connect to server
			Socket socket = new Socket("localhost", 5000);
			
			PrintWriter writer = new PrintWriter(socket.getOutputStream(),true);
			
			writer.println("HelloServer");
			
			//step3: Read response from the server
			
			BufferedReader reader = 
					new BufferedReader(new InputStreamReader(socket.getInputStream()));
			
			
		
			//Print the response
			String response = reader.readLine();
			System.out.println("Server message: "+response);
			
			
			socket.close(); 
					
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	

}
