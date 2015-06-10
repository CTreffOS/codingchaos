import math
bonus = input("bonus: ")
preis = input("preis: ")

biere = math.floor(bonus/preis)
ebene = 1
glas = 0
while glas <= biere:
	glas += (ebene ** 2)
	ebene += 1
	
print ebene-2