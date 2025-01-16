"""
PYTHON CODING CHALLENGE
9. Return the number of vowels in a string.
"""
def count_vowels(s):
    vowels = "aeiouAEIOU"
    count = 0
    for char in s:
        if char in vowels:
            count += 1
    print("The number of vowels in the string is:", count)
    return count

