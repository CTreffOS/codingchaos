require_relative 'model'

if ARGV.count() == 3
 m = Model.new
  puts m.calculate(ARGV[0].to_i, ARGV[1].to_i, ARGV[2].to_i)
end