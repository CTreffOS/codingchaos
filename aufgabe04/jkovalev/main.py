import sys

def main(money, price):
	bottles = money // price
	layers = 0;
	bottles_per_layer = 1;
	while bottles >= bottles_per_layer:
		bottles -= bottles_per_layer
		layers += 1
		bottles_per_layer *= 4
	print(layers)





if __name__ == "__main__":
	if len(sys.argv) < 2:
		raise Exception("argument missing")
	money = float(sys.argv[1])
	price = float(sys.argv[2])
	main(money, price)