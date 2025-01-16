import Task1
import Task2
import Task3
import Task4
import Task5
import Task6
import Task7
import Task8
import Task9
import Task10
import unittest


class MyTestCase(unittest.TestCase):
    def test_sum_of_array(self):
        self.assertEqual(Task1.sum_of_array([1, 2, 3]), 6)
        self.assertEqual(Task1.sum_of_array([0, -1, 1]), 0)

    def test_length_converter(self):
        self.assertAlmostEqual(Task2.length_converter(1), 3.28084)
        self.assertAlmostEqual(Task2.length_converter(0), 0)
        self.assertAlmostEqual(Task2.length_converter(3), 9.84252)


    def test_print_even_numbers(self):
        result = Task3.print_even_numbers(100)
        self.assertEqual(result, [0, 2, 4, 6, 8, 10, 12, 14, 16, 18, 20, 22, 24,
                                  26, 28, 30, 32, 34, 36, 38, 40, 42, 44,
                                  46, 48, 50, 52, 54, 56, 58, 60, 62, 64,
                                  66, 68, 70, 72, 74, 76, 78, 80, 82, 84,
                                  86, 88, 90, 92, 94, 96, 98, 100])

    def test_print_multiplication_table(self):
        result = Task4.print_multiplication_table(1, 5)
        expected_result = [1, 2, 3, 4, 5]
        self.assertEqual(result, expected_result)
        result = Task4.print_multiplication_table(3, 12)
        self.assertEqual(result, [3, 6, 9, 12, 15,18, 21, 24, 27, 30, 33, 36])
        result = Task4.print_multiplication_table(5, 10)
        self.assertEqual(result, [5, 10, 15, 20, 25, 30, 35, 40, 45, 50])

    def test_reverse_array(self):
        self.assertEqual(Task5.reverse_array([1, 2, 3]), [3, 2, 1])
        self.assertEqual(Task5.reverse_array([]), [])

    def test_sort_strings(self):
        self.assertEqual(Task6.sort_strings(["banana", "apple", "cherry"]), ["apple", "banana", "cherry"])

    def test_sort_numbers_desc(self):
        self.assertEqual(Task7.sort_numbers_desc([1, 3, 2]), [3, 2, 1])

    def test_is_divisible_by_10(self):
        self.assertTrue(Task8.is_divisible_by_10(20))
        self.assertFalse(Task8.is_divisible_by_10(21))

    def test_count_vowels(self):
        self.assertEqual(Task9.count_vowels("hello"), 2)
        self.assertEqual(Task9.count_vowels("sky"), 0)

    def test_filter_negatives(self):
        self.assertEqual(Task10.filter_negative_numbers([-1, 2, -3, 4]), [2, 4])
        self.assertEqual(Task10.filter_negative_numbers([1, 2, 3]), [1, 2, 3])


if __name__ == '__main__':
    unittest.main()
