
# tests are considered passing so long as no error escapes the function
# def test_1():
#     print("Hello test 1 ")
#
# def test_2():
#     print("Hello test 2")
#     x = 90/0
#
# def test_3():
#     print("Hello test 3")
#     assert False # the ONLY thing the assert key woud does is check that some value is True
#     # if not it raises an error

# pytest -s for output of all tests
from calculators.temperature_calculator import TemperatureCalculator, TemperatureCalculatorImpl

# Reaplce the oringinal None with a proper implementation
temp_calculator: TemperatureCalculator = TemperatureCalculatorImpl()


def test_convert_F_C():
    temp = temp_calculator.farenheit_to_celcius(212)
    assert temp == 100

def test_convert_C_F():
    temp = temp_calculator.celcius_to_farenheit(100)
    assert temp == 212

def test_flexible_convert():
    temp = temp_calculator.convert_temp(100,"C","F")
    assert  temp == 212

def test_flexible_convert2():
    temp = temp_calculator.convert_temp(100,"c","f")
    assert  temp == 212

# This is a NEGATIVE test
# Testing that a funciton FAILS or creates an error the way it is supposed to
def test_flexible_convert3():
    try:
        temp_calculator.convert_temp(245,"f","v")
        assert False # if that error was not thrown this
    except ValueError as e:
        assert str(e) =="Only the values f,F or c,C are acceptable "
