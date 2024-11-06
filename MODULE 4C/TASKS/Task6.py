"""
Declare two numbers with any values
Check if the first number is greater than 50 and check if the second number is less than 100, if True print out "Evaluation is True"
Add an else block that prints "Evaluation is False"
Declare a string with value "python"
Check if the first string is equal to "testify" or "python", if True prints out "Yay!! The string is a Testify Python".

Use the logical and to check if the first number is greater than 50 and the second number is less than 100.

"""
number1 = 60
number2 = 30

if number1 > 50 and number2 < 100:
    print("Number1 is greater than 50 and Number2 is lesser than 100")
else:
    print("Evaluation is False")

Test = "python"
if Test == "python" or "testify":
    print("Yay!! The string is a Testify Python")
else:
    print("Failed")