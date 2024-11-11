"""
Create a function that accepts two numbers, adds the numbers and prints out the result in the console.

Create a function that return the string value "Testify Python"

Invoke/call the two functions

"""
def add_numbers(num1, num2):
    result = num1 + num2
    print(f"The result of adding {num1} and {num2} is: {result}")

def testify_python():
    return "Testify Python"

# Invoke the functions
add_numbers(5, 3)
print(testify_python())