#Write a program that asks the userto enter their name and their age.
#Print out a message addressed to them that tells them the year that they will turn 100 years old.
name = input("Enter usernmae")
print("User name is "+ name)
age = input("Enter age")
year_turn_100 = ( 100 - int(age) ) + 2025
print("Hi "+ name +" you will turn 100 in year "+str(year_turn_100))

