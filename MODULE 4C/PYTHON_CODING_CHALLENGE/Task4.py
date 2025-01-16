"""
PYTHON CODING CHALLENGE
4. Print a table containing multiplication tables.
"""

def print_multiplication_table(n, limit):
    multiplication_table = []
    for i in range(1, limit + 1):
        multiplication_table.append(n * i)
    print("Multiplication Table for", n, ":", multiplication_table)
    return multiplication_table

