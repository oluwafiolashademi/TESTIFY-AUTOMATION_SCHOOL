"""
Create a class called Human
Add an attribute leg_count with the value of 4
Add another attribute can_walk with the value of True
Create a method called get_description, the method should print "This is human"
Create another method that return the leg count, the name of the method is your choice

Optionally you can instantiate the class and invoke the method get_description() and invoke your method that returns leg count.

"""
class Human:
    def __init__(self):
        self.leg_count = 4        # Attribute for the number of legs
        self.can_walk = True      # Attribute to indicate if the human can walk

    def get_description(self):
        print("This is human")    # Method that prints a description

    def get_leg_count(self):
        return self.leg_count     # Method that returns the leg count

person = Human()

# Invoke the methods
person.get_description()
leg_count = person.get_leg_count()
print(f"Leg Count: {leg_count}")