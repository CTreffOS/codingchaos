import sys, os
sys.path.append((os.path.dirname(__file__) or '.') + '/..')

import xy
import unittest


class TestSequenceFunctions(unittest.TestCase):

	def test_xy(self):
		result = xy.test()
		self.assertEqual(result, '123')


if __name__ == '__main__':
	unittest.main()
