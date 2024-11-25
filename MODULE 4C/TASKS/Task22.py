"""
Create a class called Hunt
Create a private attribute called __weapon with the value "Assault Rifle" in the Hunt class
Create a method get_weapon() that returns "Not Available" in the Hunt class
Instantiate an object of the Hunt class
Print the value of get_weapon() from the object instance
"""
class Hunt:
    def __init__(self):
        self.__weapon = "Assault Rifle"

    def get_weapon(self):
        return "Not Available"

hunt_instance = Hunt()

# Print the value of get_weapon() from the object instance
print(hunt_instance.get_weapon())