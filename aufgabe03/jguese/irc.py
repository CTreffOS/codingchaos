# Import some necessary libraries.
import socket 

# Some basic variables used to configure the bot        
server = "irc.freenode.net" # Server
channel = "#codingchaos" # Channel
botnick = "GueseBot" # Your bots nick


def ping(): 
  ircsock.send("PONG :pingis\n")  

def sendmsg(chan , msg):
  ircsock.send("PRIVMSG "+ chan +" :"+ msg +"\n") 

def joinchan(chan): 
  ircsock.send("JOIN "+ chan +"\n")

def hello(): 
  ircsock.send("PRIVMSG "+ channel +" :hello!\n")
                  
ircsock = socket.socket(socket.AF_INET, socket.SOCK_STREAM)
ircsock.connect((server, 6667)) 
ircsock.send("USER "+ botnick +" "+ botnick +" "+ botnick +"\n") # user authentication
ircsock.send("NICK "+ botnick +"\n") 

joinchan(channel) 

while 1: 
  ircmsg = ircsock.recv(2048) 
  print(ircmsg) # Here we print what's coming from the server

  if ircmsg.find("!say") != -1: #say function
    hello()

  if ircmsg.find("PING :") != -1: # if the server pings us then we've got to respond!
    ping()
