#Print the values only in the Usernames column
#Print the username and password of the second row
#Sort the Usernames column data in ascending order and print data
#Sort the Passwords column in descending order and print data
#Hint: You can use DataFrame.sort_values("column") to sort your data
#Hint: You can use DataFrame.sort_values("column", ascending=false) to sort your data in descending order.
import pandas as pd

readData = pd.read_csv("activity17_output.csv")

usernameList = readData["Usernames"].values
print(f"Usernames from csv files are : {usernameList}")

second_username = readData["Usernames"].values[1] 
second_password = readData["Passwords"].values[1]
print(f"Second username and passwords are : {second_username}, {second_password} respectively")

sorted_usernames = readData.sort_values("Usernames", ascending=True)
print("\nUsernames sorted ascending:")
print(sorted_usernames)

sorted_passwords = readData.sort_values("Passwords", ascending=False)
print("\nPasswords sorted descending:")
print(sorted_passwords)