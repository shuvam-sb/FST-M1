user_input = input("Enter numbers separated by spaces")
numbers = tuple(int(num) for num in user_input.split())
print(f"Actual tuple is {numbers}")
print("Elements divisible by 5 are : ")
for num in numbers:
    if(num%5==0):
        print(num)