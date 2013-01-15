package com.araeosia.friends.server;

import com.araeosia.friends.server.threads.ServerThread;

public class Server implements Runnable {
	private boolean isRunning;

	public Server(){

	}
	@Override
	public void run(){

	}
	public void startServer(){
		new ServerThread(this);
	}
	public boolean isRunning() {
		return isRunning;
	}

	public void setRunning(boolean running) {
		isRunning = running;
	}

}