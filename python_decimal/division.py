from decimal import Decimal, getcontext

getcontext().prec = 1000
a = Decimal('10')
b = Decimal('3')

result = a / b
print(result)  # Outputs a long, accurate result


c = 10
d = 3

result2 = c / d
print(result2)