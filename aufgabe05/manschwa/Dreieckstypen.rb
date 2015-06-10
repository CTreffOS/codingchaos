puts "Dreieckstypen"
puts "============================"

a = ARGV[0].to_f
b = ARGV[1].to_f
c = ARGV[2].to_f

def triangle (a, b, c)
  if (a == 0 and b != 0 and c != 0) or (a != 0 and b == 0 and c != 0) or (a != 0 and b != 0 and c == 0)
    return 0
  elsif (a**2 + b**2 == c**2) or (a**2 == b**2 + c**2) or (a**2 + c**2 == b**2)
    return 2
  elsif (a**2 + b**2 < c**2) or (a**2 > b**2 + c**2) or (a**2 + c**2 < b**2)
    return 3
  elsif (a**2 + b**2 > c**2) or (a**2 < b**2 + c**2) or (a**2 + c**2 > b**2)
    return 1
  end
end

puts "Triangle Type: #{triangle(a,b,c)}"
