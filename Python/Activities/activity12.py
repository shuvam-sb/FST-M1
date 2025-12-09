#Write a recursive function to calculate the sum of numbers from 0 to 10
def rec(num):
    if num == 0:
        return 0
    return num + rec(num - 1)

print(f"Sum of numbers from 0 to 10 is = {rec(10)}")
