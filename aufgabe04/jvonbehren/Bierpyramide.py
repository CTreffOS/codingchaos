import sys

def highest_level(money, price):
    i = 1
    while money >= i**2 * price:
        money -= price * i ** 2
        i += 1
    print(i - 1)

if __name__ == '__main__':
    if len(sys.argv) < 3:
        raise Exception("missing arguments")
    highest_level(float(sys.argv[1]), float(sys.argv[2]))
