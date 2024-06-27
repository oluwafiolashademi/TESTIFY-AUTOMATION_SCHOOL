import Main
import unittest

class TestMain(unittest.TestCase):

    def test_addition(self):
        self.assertEqual(Main.equal.add(1, 2), 3, "should be 3")
        self.assertEqual(Main.equal.add(5, 5), 10, "should be 10")
        self.assertEqual(Main.addition(40, 20), 60, "should be 60")
        self.assertEqual(Main.addition(-3, 2), -1, "should be 3")

if __name__ == '__Main__':
    unittest.Main()
    