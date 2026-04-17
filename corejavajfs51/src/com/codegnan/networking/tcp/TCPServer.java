package com.codegnan.networking.tcp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

/*
1. Create ServerSocket and specify port 5000
2. Accept client connection
3. Read data from client
    by using BufferedReader, InputStreamReader etc.    
4.     
5. Close r
esources. 
*/

public class TCPServer {
	
	public static void main(String[] args) {
		try {
			// Create ServerSocket and specify port 5000
			ServerSocket serverSocket = new ServerSocket(5000);
			System.out.println("Server is waiting for client....");
			//Accept client connection
			Socket socket = serverSocket.accept();
			System.out.println("Client connected");
			//Read data from client
			InputStream inputStream = socket.getInputStream();
			InputStreamReader inputStreamReader = new InputStreamReader(inputStream);
			BufferedReader reader = new BufferedReader(inputStreamReader);
			
			String message = reader.readLine();
			System.out.println("Client message: "+message);
			
			
			//Send Response to client by using PrintWriter. 
			PrintWriter writer = new PrintWriter(socket.getOutputStream(), true);
			writer.println("Hello from Server");
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
