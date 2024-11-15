"""
Declare a dictionary with any key-value pair of items/elements
Print the dictionary in console
Update the dictionary with two different key-value pair items
Print the dictionary in console again

Note: you can experiment with the other list functions too in the task
"""
# Declare a dictionary with key-value pairs
my_dict = {
    "name": "Folakemi",
    "age": 30,
    "city": "Lagos",
    "Nationality": "Nigerian"
}

# Print the original dictionary
print("Dictionary:", my_dict)

# Update the dictionary with two new key-value pairs
my_dict["job"] = "Engineer"
my_dict["hobby"] = "Painting"

# Print the updated dictionary
print("Updated dictionary:", my_dict)

# Accessing a value
print("Name:", my_dict["name"])

# Checking if a key exists
if "age" in my_dict:
    print("Age exists in the dictionary.")

# Removing a key-value pair
removed_value = my_dict.pop("city")
print("Removed city:", removed_value)
print("Dictionary after removing 'city':", my_dict)

# Getting the keys and values
keys = my_dict.keys()
values = my_dict.values()
print("Keys:", list(keys))
print("Values:", list(values))
