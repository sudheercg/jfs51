package com.codegnan.networking.inetaddress;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class InetAddressDemo {

	public static void main(String[] args) {

		InetAddress local;
		try {
			local = InetAddress.getLocalHost();
			System.out.println("LocalHost: " + local);
			
			InetAddress googleIP= InetAddress.getByName("www.google.com");
			System.out.println("Google IP : "+googleIP);
			
			InetAddress[] all = InetAddress.getAllByName("www.google.com");
			
			for(InetAddress ip: all) {
				System.out.println("IP: "+ip);
			}
			
		} catch (UnknownHostException e) {
			e.printStackTrace();
		}

	}

}
