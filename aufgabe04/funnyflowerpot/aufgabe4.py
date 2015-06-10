import sys
g,b=map(float,sys.argv[1:])
n=0 # http://de.wikipedia.org/wiki/Gau%C3%9Fsche_Summenformel#Verwandte_Summen
while g/b>=n*(n+1)*(2*n+1)/6: n=n+1
print n-1
