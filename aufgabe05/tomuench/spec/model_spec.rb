require_relative '../app/model'

describe 'Model' do

  describe '#Icy Cool Function' do
    it 'expects something' do
      m = Model.new
      m.calculate(5,4,5)
      puts m.alpha
      puts m.beta
      puts m.gamma
    end
  end
end