package chat;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;

public class ChatServer {
	private static final int PORT = 9999;
	
	public static void main( String[] args ) {
		List<PrintWriter> listPrintWriter = new ArrayList<PrintWriter>();
		
		ServerSocket serverSocket = null;
		
		try {
			serverSocket = new ServerSocket();
			serverSocket.setReuseAddress( true );
			
			serverSocket.bind( new InetSocketAddress("0.0.0.0", PORT), 5 );
			consoleLog( "ChatServer Starts at " + PORT );
			
			while( true ) {
				//3. wating for connection
				Socket socket = serverSocket.accept();
				
				Thread thread = new ChatServerThread( socket, listPrintWriter  );
				thread.start();
			}
		} catch (IOException e) {
			consoleLog( "error:" + e );
		} finally {
			try {
				if( serverSocket != null && 
					serverSocket.isClosed() == false ){
					serverSocket.close();
				}
			}catch( IOException ex ) {
				consoleLog( "error:" + ex );
			}
		}
	}
	
	public static void consoleLog( String message ) {
		System.out.println( "[chat server]" + message );
	}
}
