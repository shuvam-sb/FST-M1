user_input = input("Enter the number for the list seperated by spaces : ")
numbers = [int(num) for num in user_input.split()]
if(numbers[0]==numbers[-1]):
    print("True")
else:
    print("False")