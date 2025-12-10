import pytest

# Functions to test
def add(a, b):
    return a + b

def subtract(a, b):
    return a - b

def multiply(a, b):
    return a * b

def divide(a, b):
    return a / b


# Tests

def test_sum():
    assert add(10, 5) == 15

def test_difference():
    assert subtract(10, 5) == 5

def test_product():
    assert multiply(10, 5) == 50

def test_quotient():
    assert divide(10, 5) == 2
