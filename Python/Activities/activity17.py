import pandas as pd
#import ExcelWriter from pandas

data = {
    "Usernames" : ["Admin","Charles","Deku"],
    "Passwords" : ["Password","Charl13","AllMight"]
}
dataframe = pd.DataFrame(data)
print(dataframe)

dataframe.to_csv("activity17_output.csv", index=False)

