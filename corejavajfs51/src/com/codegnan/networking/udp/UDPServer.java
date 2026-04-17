package com.codegnan.networking.udp;

import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class UDPServer {
	public static void main(String[] args) {
		try {
			// Step 1: Create socket with port
			DatagramSocket socket = new DatagramSocket(6000);
			System.out.println("Server waiting for data...");

			// Step 2: Create buffer
			byte[] buffer = new byte[1024];

			// Step 3: Create packet
			DatagramPacket packet = new DatagramPacket(buffer, buffer.length);

			// Step 4: Receive data
			socket.receive(packet);

			// Step 5: Convert to string
			String msg = new String(packet.getData());
			System.out.println("Received: " + msg);

			socket.close();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}