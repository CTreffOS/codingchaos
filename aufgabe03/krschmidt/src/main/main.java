package main;
import java.io.*;
import java.net.*;

public class main
{
 public static void main(String argv[]) throws Exception
 {
  String sentence;
  String modifiedSentence;
//  System.out.println("test");
  BufferedReader inFromUser = new BufferedReader( new InputStreamReader(System.in));
  Socket clientSocket = new Socket("irc.freenode.net", 6667);
  System.out.println(clientSocket.isConnected());

  DataOutputStream outToServer = new DataOutputStream(clientSocket.getOutputStream());
  BufferedReader inFromServer = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
//  sentence = inFromUser.readLine();
//  outToServer.writeBytes(sentence + '\n');
  outToServer.writeBytes("USER <krschmidt1> <bla> <bla> <bla>\r\n");
  modifiedSentence = inFromServer.readLine();
  System.out.println("FROM SERVER: " + modifiedSentence);
  outToServer.writeBytes("NICK <krschmidt>\r\n");
  modifiedSentence = inFromServer.readLine();
  System.out.println("FROM SERVER: " + modifiedSentence);
  outToServer.writeBytes("JOIN #codingchaos\r\n");
  modifiedSentence = inFromServer.readLine();
  System.out.println("FROM SERVER: " + modifiedSentence);
  boolean test = true;
  while(test)
  {
	  modifiedSentence = inFromServer.readLine();	  
	  if(modifiedSentence.contains("PING"))
		  outToServer.writeBytes("PONG <daemon>\r\n");		  
	  if(modifiedSentence.equals("#codingchaos :!say"))
		  outToServer.writeBytes("JOIN #codingchaos\r\n");
  }
  clientSocket.close();
 }
}