import sys,math,itertools
r,s,t=map(float,sys.argv[1:])
print filter(lambda(n,t):t,enumerate(map(lambda o,a:o(a),[any,all,any,any],zip(*map(lambda w:(w==0,w<1 and w!=0,w==1,w>1),map(lambda a,b,c:a*b>0 and(a**2+b**2-c**2)/(2*a*b)or 0,[r,s,t],[s,r,t],[t,r,s]))))))[0][0]
