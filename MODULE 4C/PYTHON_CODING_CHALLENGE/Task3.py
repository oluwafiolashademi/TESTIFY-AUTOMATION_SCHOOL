"""
PYTHON CODING CHALLENGE
3. Print all even numbers from 0 – 100.
"""
def print_even_numbers(n):
    even_numbers = []
    for num in range(0, n + 1):
        if num % 2 == 0:
            even_numbers.append(num)
    print("Even numbers are:", even_numbers)
    return even_numbers


