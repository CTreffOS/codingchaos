import sys


def process(bonus, price):
	height = 0
	i = 1

	while True:
		if bonus >= i*i*price:
			height += 1
			bonus -= i*i*price
			i += 1
		else:
			break

	return height

if len(sys.argv) > 2:
	print "Pyramide height: %d"%process(float(sys.argv[1]), float(sys.argv[2]))
else:
	print "Missing arguments."
	sys.exit(0)