"""
Create a class called Human

Add an attribute leg_count with the value of 4

Add a method called get_gender() that returns "Unknown" in the Human class

Create another class called Man that extends Human


Optionally you can instantiate the classes Man and Woman then print out the values of the get_gender() method in each object instance
"""
class Human:
    def __init__(self):
        self.leg_count = 4

    def get_gender(self):
        return "Unknown"

class Man(Human):
    def get_gender(self):
        return "Male"

class Woman(Human):
    def get_gender(self):
        return "Female"

man_instance = Man()
woman_instance = Woman()

# Print out the gender using the get_gender() method
print(f"Man's Gender: {man_instance.get_gender()}, Leg Count: {man_instance.leg_count}")
print(f"Woman's Gender: {woman_instance.get_gender()}, Leg Count: {woman_instance.leg_count}")