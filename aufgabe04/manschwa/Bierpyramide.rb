puts "Bierpyramide"
puts "============================="

puts "Geld: "
money = gets.to_f
puts "Bierpreis: "
price = gets.to_f

amount = money/price

cnt = 0
for e in 1.upto(amount)
  amount = amount - e**2
  if amount <= 0
    puts "Ebenen: #{cnt}"
    break
  end
  cnt = cnt + 1
end
