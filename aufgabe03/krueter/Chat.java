package a3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.DataOutputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.Socket;

public class Chat 
{
	private static Socket socket;

	public static void main(String[] args) 
	{
		// The server to connect to and our details.
        String server = "irc.freenode.net";
        String nick = "krueter";
        String login = "krueter";

        // The channel which the bot will join.
        String channel = "#codingchaos";
        
        // Connect directly to the IRC server.
        try
        {
        socket = new Socket(server, 6667);
        BufferedWriter writer = new BufferedWriter(
                new OutputStreamWriter(socket.getOutputStream( )));
        BufferedReader reader = new BufferedReader(
                new InputStreamReader(socket.getInputStream( )));
        
        // Log on to the server.
        writer.write("USER krueter 0 * :krueter\r\n");
        writer.write("NICK krueter\r\n");
        writer.flush();
        
        // Read lines from the server until it tells us we have connected.
        String line = null;
        while ((line = reader.readLine( )) != null) {
        	System.out.println(line);
            if (line.contains("004")) {
            	System.out.println("Logged in");
                break;
            }
            else if (line.indexOf("433") >= 0) {
                System.out.println("Nickname is already in use.");
                return;
            }
        }
        // Join the channel.
        writer.write("JOIN " + channel + "\r\n");
        writer.flush( );
        
        // Keep reading lines from the server.
        while ((line = reader.readLine( )) != null) {
        	System.out.println(line);
        	if(line.contains("!say"))
            	writer.write("PRIVMSG " + channel + " hello!\n");
        	else if (line.toLowerCase( ).startsWith("PING ")) {
                // We must respond to PINGs to avoid being disconnected.
                writer.write("PONG " + line.substring(5) + "\r\n");
            }
        	writer.flush( );
        }
        socket.close();
        }
        catch(Exception e){e.printStackTrace();}
	}
}
