class Model
  attr_accessor :alpha, :beta, :gamma

  def calculate(a, b, c)
    @alpha = Math.acos((-a*+2+b**2+c**2)/(2*b*c) % 1)
    @beta = Math.acos((-b*+2+a**2+c**2)/(2*a*c) % 1)
    @gamma = Math.acos((-c*+2+a**2+b**2)/(2*a*b) % 1)
    puts @beta
    puts (Math::PI / 2.0)
    return 1 if @alpha.equal?(Math::PI / 2.0) || @beta.equal?(Math::PI / 2.0) || @gamma.equal?(Math::PI / 2.0)
    return 3 if @alpha > (Math::PI / 2.0) || @beta > (Math::PI / 2.0) || @gamma > (Math::PI / 2.0)
    return 0
  end
end