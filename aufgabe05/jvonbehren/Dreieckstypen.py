import sys
import math

def angle_check(angle1, angle2, angle3):
    c = (angle1**2 + angle2**2 - angle3**2)/(2 * angle1 * angle2)
    c = math.acos(c)
    a = (angle1*math.sin(c))
    a = math.asin(a)
    b = 180 - (a + c)

    if a == 90 or b == 90 or c == 90:
        print(2)
    elif a < 90 and b < 90 and c < 90:
        print(1)
    elif a > 90 or b > 90 or c > 90:
        print(3)
    elif a == 180 or b == 180 or c == 180:
        print(0)

if __name__ == '__main__':
    if len(sys.argv) < 4:
        raise Exception("missing arguments")
    angle_check(float(sys.argv[1]), float(sys.argv[2]), float(sys.argv[3]))
