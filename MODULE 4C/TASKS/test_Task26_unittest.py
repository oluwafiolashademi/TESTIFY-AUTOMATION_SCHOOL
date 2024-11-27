import Task26
import unittest

class TestComparisonFunctions(unittest.TestCase):
    def test_compare_strings(self):
        self.assertTrue(Task26.compare_strings("Hello", "Hello"))
        self.assertFalse(Task26.compare_strings("Hello", "World"))

    def test_compare_numbers(self):
        self.assertTrue(Task26.compare_numbers(10, 10))
        self.assertFalse(Task26.compare_numbers(10, 20))

if __name__ == '__main__':
    unittest.main()
