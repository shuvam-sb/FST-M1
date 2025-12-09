fruits = {
    "apple" : 25,
    "banana" : 10,
    "Avacado" : 80
}
search_fruit = input("Enter the fruit name you want to search for : ")
if(search_fruit in fruits):
    print("{search_fruit} is present in fruitshop")
else:
    print(f"{search_fruit} is not present in fruitshop")