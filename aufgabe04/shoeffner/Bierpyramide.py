# -*- coding: utf8 -*-
import sys
import math

def beersNeeded(level):
	if level == 0:
		return 0
	return beersNeeded(level - 1) + level ** 2

if __name__ == '__main__':
	bonus = float(sys.argv[1])
	price = float(sys.argv[2])
	maxBeers = math.floor(bonus / price)
	
	level = 1
	while beersNeeded(level) <= maxBeers:
		level += 1
	
	print level-1