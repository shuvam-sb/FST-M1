class Car:
    def __init__(self, manufacturer, model, make, color, transmission):
        self.manufacturer = manufacturer
        self.model = model
        self.make = make
        self.color = color
        self.transmission = transmission
    def accelerate(self):
        print(f"{self.manufacturer} {self.model} is moving")
    def stop(self):
        print(f"{self.manufacturer} {self.model} is stopped")

car1 = Car("Toyota", "Corolla", 2020, "Red", "Automatic")
car2 = Car("Honda", "Civic", 2019, "Blue", "Manual")
car3 = Car("Ford", "Mustang", 2021, "Black", "Automatic")

car1.accelerate()  
car2.stop()        
car3.accelerate()  


