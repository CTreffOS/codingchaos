import sys
l=sys.argv[2]
w=sys.argv[1]
b=int(l)
s=int(w)
if w > l:
    b=w
    s=l
while(s > 0):
    print s
    t=b
    b=s
    s=t-s 
    
