package com.araeosia.friends.server;

import java.io.IOException;

public class Main {
	public static void main(String[] args){
		Server srv = new Server();
		while (srv.isRunning()){
			try {
				// TODO server
			} catch (IOException e){
				e.printStackTrace();
			}
		}
	}
}
