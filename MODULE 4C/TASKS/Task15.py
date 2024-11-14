"""
Declare a list with any value and number of item/element
Print the list in console
Sort the list
Print the list in console again

Note: you can experiment with the other list functions too in the task.
"""
my_list = [34, 12, 5, 67, 23, 89, 1]
print("List:", my_list)

# Sort the list
my_list.sort()
print("Sorted list:", my_list)

my_list.append(45)  # Adding an element
print("Append 45:", my_list)

my_list.remove(12)  # Removing an element
print("Remove 12:", my_list)

my_list.reverse()  # Reversing the list
print("Reverse:", my_list)
