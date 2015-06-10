class Pyramid
  attr_reader :beer_count, :layers

  def initialize(money, beer_price)
    @beer_count = (money / beer_price).floor()
    @layers = 0
  end

  def calculate
    return if @beer_count <= 0
    count = 1
    i = 1
    while (count <= beer_count)
      count+= (i+1)**2
      i+=1
      @layers+=1
    end
  end

  def print
    puts "Height: #{@layers}"
    (0..layers).each do |i|
      puts  "#" * (i+1)**2
    end
  end
end