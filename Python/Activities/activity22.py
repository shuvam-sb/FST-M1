import pytest
#Running commands base on marker
# pytest -v -m activity activity22.py  => executed 2 test functions marked with marker activity
#Running command based on substr
#pytest -v -k test activity22.py  => executed 4 test fun

def add(a, b):
    return a + b

def subtract(a, b):
    return a - b

def multiply(a, b):
    return a * b

def divide(a, b):
    return a / b


# Tests
@pytest.mark.activity
def test_sum():
    assert add(10, 5) == 15

@pytest.mark.activity
def test_difference():
    assert subtract(10, 5) == 5

def test_product():
    assert multiply(10, 5) == 50

def test_quotient():
    assert divide(10, 5) == 2
