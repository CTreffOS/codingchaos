width = ARGV[0].to_i
height = ARGV[1].to_i
numbers = []

while width > 0 && height > 0
	if width >= height
		numbers << height
		width -= height
	else
		numbers << width
		height -= width
	end
	
end
print numbers
puts ""