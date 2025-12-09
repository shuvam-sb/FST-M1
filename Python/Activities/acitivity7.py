user_input = input("Enter number seperated by spaces : ")
numbers = [int(num) for num in user_input.split()]
print(sum(numbers))