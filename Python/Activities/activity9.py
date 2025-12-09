list1 = [22,1,3,44,9,66]
list2 = [20,1,3,40,9,60,80]
list3=[]
for num in list1:
    if(num%2!=0):
        list3.append(num)

for num in list2:
    if(num%2==0):
        list3.append(num)
print(list3)