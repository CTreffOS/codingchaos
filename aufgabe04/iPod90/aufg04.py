#!/usr/bin/python
import sys
import math

money = float(sys.argv[1])
beerprice = float(sys.argv[2])
floor = 1
possible = True
while possible:
	possible = (money - beerprice * floor**2) >= 0
	if possible:
		money -= beerprice * floor**2
		floor += 1

print floor-1

