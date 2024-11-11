"""

Declare a global variable with name as language and the value as "Python"
Create a function, in the function declare a variable with name as language and value as "Java", then print out the variable in the function
Print out the variable name into the console
Invoke the function
"""
language = "Python"

def change_language():
    # Declare a local variable with the same name
    language = "Java"
    print("Local variable:", language)

change_language()

# Print out the global variable
print("Global variable: ", language)  # Prints the global variable