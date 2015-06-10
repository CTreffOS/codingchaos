import sys
import math
r,s,t=map(float,sys.argv[1:])
a=map(lambda a,b,c:(a**2+b**2-c**2)/(2*a*b),[r,s,t],[s,r,t],[t,r,s])
if all(map(lambda w: w<1, a)): print 1
elif any(map(lambda w: w==1, a)): print 2
elif any(map(lambda w: w>1, a)): 
  print not any(map(lambda w: w==0, a)) and 3 or 0
