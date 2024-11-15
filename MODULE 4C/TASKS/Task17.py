"""

Create a class called Human
Initialize the class

"""

class Human:
    name = "Folakemi"
    age = 30
    def get_Data(self):
        return self.name + ":" + self.age

person = Human()
# Print the attributes of the instance
print(f"Name: {person.name}, Age: {person.age}")