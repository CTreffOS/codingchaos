import sys
a=map(float,sys.argv[1:])
if all(map(lambda w: w<90, a)): print 1
elif any(map(lambda w: w==90, a)): print 2
elif any(map(lambda w: w>90, a)): 
  print not any(map(lambda w: w==180, a)) and 3 or 0
