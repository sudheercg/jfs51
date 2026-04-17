package com.codegnan.networking.udp;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class UDPClient {
	
	public static void main(String[] args) {
		try {
			
			//step1: create a socket
			DatagramSocket socket = new DatagramSocket(); 
			
			//step2:Message
			String msg = "Hello UDP";
			
			byte[] data = msg.getBytes();
			
			InetAddress ip = InetAddress.getByName("localhost");
			
			//create a packet
			DatagramPacket packet = 
					new DatagramPacket(data,data.length,ip,6000);
			
			//send the data
			socket.send(packet);
			
			System.out.println("Message Sent");
			
			//close the socket
			socket.close();
	}catch(Exception e) {
			e.printStackTrace();
		}
	}

}
