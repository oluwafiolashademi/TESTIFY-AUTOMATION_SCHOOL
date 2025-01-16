"""
PYTHON CODING CHALLENGE
10. Create a function that filters out negative numbers.
"""
def filter_negative_numbers(arr):
    non_negative_numbers = []
    for num in arr:
        if num >= 0:
            non_negative_numbers.append(num)
    print("Filtered Non-Negative Numbers:", non_negative_numbers)
    return non_negative_numbers
