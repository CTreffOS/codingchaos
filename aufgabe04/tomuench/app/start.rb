require_relative 'pyramid'

if ARGV.count() == 2
  p = Pyramid.new(ARGV[0].to_f, ARGV[1].to_f)
  p.calculate
  p.print
end