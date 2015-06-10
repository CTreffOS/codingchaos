# -*- coding: utf8 -*-
import sys
import math

def lawOfCosine(a, b, c):
	if b*c == 0:
		return 180
	return 180*math.acos((b*b+c*c-a*a)/(2*b*c))/math.pi

def determineTriangleType(a, b, c):
	a1 = lawOfCosine(a, b, c)
	a2 = lawOfCosine(c, a, b)
	a3 = 180-a1-a2
	if a1 < 90 and a2 < 90 and a3 < 90:
		return 1
	elif a1 == 90 or a2 == 90 or a3 == 90:
		return 2
	elif a1 > 90 or a2 > 90 or a3 > 90:
		return 3
	else:
		return 0
	
if __name__ == '__main__':
	a, b, c = float(sys.argv[1]), float(sys.argv[2]), float(sys.argv[3])
	print(determineTriangleType(a, b, c))