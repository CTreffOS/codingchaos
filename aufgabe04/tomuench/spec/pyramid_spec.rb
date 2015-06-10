require_relative '../app/pyramid'
describe 'Pyramid' do

  describe '#calculate' do
    it 'expects something' do
      p = Pyramid.new(25.00, 3)
      p.calculate

      expect(p.beer_count).to eq(8)
      expect(p.layers).to eq(2)
    end

    it 'Next Layer' do
      p = Pyramid.new(42.00, 3.0)
      p.calculate
      expect(p.layers).to eq(3)
    end
  end
end