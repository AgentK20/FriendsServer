package com.araeosia.friends.server.threads;

import com.araeosia.friends.server.Server;

public class ServerThread extends Thread {
	private Server server;

	public ServerThread(Server srv){
		this.server = srv;
	}

	@Override
	public void run(){
		server.run();
	}
}
