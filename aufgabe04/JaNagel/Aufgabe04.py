import sys
import math
eingabe = (sys.argv[1],sys.argv[2]) if len(sys.argv)>2 else (500,5)
assert eingabe[0]>0;assert eingabe[1]>0
nBier = int(math.floor(eingabe[0]/eingabe[1]))
n=-1
while nBier >= 0:
    nBier = nBier - (2+n)**2
    n+=1
print 'Hoehe: %i' % n