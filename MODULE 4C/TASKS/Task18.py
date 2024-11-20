"""

Create a class called Human
Add an attribute leg_count with the value of 4
Add another attribute can_walk with value of True

Optionally you can instantiate the class and prints out the leg_count and can_walk attributes

"""
class Human:
    leg_count = 2  # Class attribute for leg count
    can_walk = True  # Class attribute to indicate if the human can walk

    def __init__(self, name):
        self.name = name


# Instantiate the class
person = Human("Alice")

print("Leg Count: ", person.leg_count)
print("Can Walk: ", person.can_walk)
print("Name: ", person.name)