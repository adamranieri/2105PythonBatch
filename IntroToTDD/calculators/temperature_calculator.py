
# the science lab was some functions for converting between temperatures

# 1. write the interface (Python does not have an interface keyword)
from abc import ABC, abstractmethod


# ABC is ABstract Class. An abstract Class is a class you cannot directly create
class TemperatureCalculator(ABC):

    @abstractmethod
    def celcius_to_farenheit(self, temp: float) -> float:
        pass

    @abstractmethod
    def farenheit_to_celcius(self, temp: float) -> float:
        pass

    # converts from betwetween temps convert_temp(100,"C","F")
    @abstractmethod
    def convert_temp(self, temp: float, initial: str, target: str) -> float:
        pass




class TemperatureCalculatorImpl(TemperatureCalculator):

    def celcius_to_farenheit(self, temp: float) -> float:
        f = (temp * 9/5) + 32
        return f


    def farenheit_to_celcius(self, temp: float) -> float:
        c = (temp-32) * 5/9
        return c


    def convert_temp(self, temp: float, initial: str, target: str) -> float:
        initial = initial.upper()
        target = target.upper()

        if initial not in ["C","F"] or target not in ["C","F"]:
            raise ValueError("Only the values f,F or c,C are acceptable ")

        if initial == "C" and target == "F":
            return  self.celcius_to_farenheit(temp)
        elif initial == "F" and target == "C" :
            return  self.farenheit_to_celcius(temp)

