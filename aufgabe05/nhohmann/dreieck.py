import sys
import math


# Convert length to angle
def lengthToAngle(a, b, c):
	a1 = math.acos((b*b + c*c - a*a) / (2*b*c))
	a2 = math.acos((a*a + c*c - b*b) / (2*a*c))
	a3 = math.acos((a*a + b*b - c*c) / (2*a*b))

	radToBog = 180/math.pi
	return [a1*radToBog, a2*radToBog, a3*radToBog]

def process(a, b, c):
	angles = lengthToAngle(a, b, c)
	print angles

	return "**0**" if max(angles) >= 180 else "**3**" if max(angles) > 90 else "**2**" if max(angles) == 90 else "**1**"

if len(sys.argv) > 3:
	print process(float(sys.argv[1]), float(sys.argv[2]), float(sys.argv[3]))
else:
	print "Missing arguments."
	sys.exit(1)