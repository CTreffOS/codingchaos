a = 0
zahl = 1
test = false
loop do
	puts "Bitte Integer eingeben: " 
	a = Integer(gets) rescue nil
	break if !a.nil?
end

puts "Ausgabe:"
while zahl < a
	
	if (zahl%3 == 0)
		print "Fizz"
		test= true
	end

	if (zahl%5 == 0)
		print "Buzz"
		test = true
	end
	if !test
		print zahl
	end
	print "\n"	
	zahl += 1
	test = false
end