import pandas as pd
df = pd.read_excel("activity19_output.xlsx")
# Print number of rows and columns
print("Rows:", df.shape[0])
print("Columns:", df.shape[1])

#list of emails
emailList = df["Email"].values
print("List of emails from the excel sheet are : ")
for email in emailList:
    print(email)

print ("The data after sorting it by FirstName :")
sortedFirtName = df.sort_values("FirstName",ascending=True)
print(sortedFirtName)