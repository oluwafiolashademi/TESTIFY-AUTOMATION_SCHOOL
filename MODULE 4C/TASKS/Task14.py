"""
Declare a string variable with any value

Print out the string in the upper case form

Note: you can experiment with the other functions call too in the task.
"""
Project = "At Testify Automation School, we were taught a wide range of topics, starting from how to use GitHub Actions, CI/CD pipelines, and JavaScript, to API testing, Java, and now Python. The learning experience was both educational and insightful."

# Upper case form
Uppercase_Project = Project.upper()
print("Uppercase: ", Uppercase_Project)

# Capitalize form
Capitalize_Project = Project.capitalize()
print("Capitalize: ", Capitalize_Project)

# Length form
Size = len(Project)
print("Size: ", Size)

# Count form
Count_Project = Project.count("to")
print("Count: ", Count_Project)

# Left Strip form
lstrip_Project = Project.lstrip("At Testify Automation School,")
print("Left strip: ", lstrip_Project)

# Split form
Split_Project = Project.split(",")
print("Split: ", Split_Project)
