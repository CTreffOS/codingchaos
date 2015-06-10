from __future__ import division
import sys
import math

In = [float(sys.argv[1]),float(sys.argv[2]),float(sys.argv[3])] if len(sys.argv)>3 else [5.0,7.0,6.6023252670426267717294735350497]
def dreieckTest(In):
    sorted(In)
    if In[2] >= In[1]+In[0]:
        print 'Linie oder garnix'
        return 0
    eta = 10.0**-5
    diff = In[2]**2 - (In[1]**2+In[0]**2)
    if math.fabs(diff) < eta:
        print 'Rechtwinkliges Dreieck!'
        return 2
    elif diff > eta:
        print 'Stumpfwinkliges Dreieck'
        return 3
    else:
        print 'Spitzwinkliges Dreieck'
        return 1
print 'Ausgabe: '+str(dreieckTest(In))