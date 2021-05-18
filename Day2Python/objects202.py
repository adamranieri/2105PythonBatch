class Car:

    total_cars = 0

    def __init__(self, make: str, model: str, year: int, owner: str, mileage: int = 0) -> None:
        self.make = make
        self.model = model
        self.year = year 
        self.owner = owner
        self.mileage = mileage
        Car.total_cars += 1
    
    def __str__(self):
        return f"Make: {self.make}, Model: {self.model}, Year: {self.year}, Owner: {self.owner}, Miles: {self.mileage}"
    
    def drive_car(self, distance: int):
        print(f"Driving the car {distance} miles")
        self.mileage += distance
    
    #class method. A method that is attached to the class 
    #it does not pass in self as the first argument because it does not need a car instance
    # for it to work. Think static in Java
    def miles_to_kilos(miles: int):
        kilos = miles*1.6
        return kilos
    
    # Objects are mutable and you can always attached new properties to the instance
    def paint_car(self, color: str):
        self.color = color




crosstrek = Car("Subaru","Crosstrek",2018,"Adam Ranieri")
print(crosstrek)

crosstrek.drive_car(100)
print(crosstrek)
crosstrek.drive_car(50)
print(crosstrek)
kilometers = Car.miles_to_kilos(87)
print(kilometers)
# crosstrek.miles_to_kilos(100)
# Car.miles_to_kilos(crosstrek,100)
# crosstrek.paint_car("White")
# print(crosstrek.color)

