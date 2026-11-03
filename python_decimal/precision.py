from decimal import Decimal, getcontext, ROUND_HALF_UP

print(getcontext())

# Set precision to 4 decimal places
getcontext().prec = 4

print(getcontext())

a = Decimal('1.12345')
b = Decimal('2.34567')

result = a + b
print(a)
print(b)
print(result)  # Output will be rounded to 4 decimal places

#Bankers' rounding HALF_EVEN is the default rounding method in Python


getcontext().rounding = ROUND_HALF_UP

c = Decimal('1.124')
d = Decimal('0.0004')

result2 = c + d
print(c)
print(d)
print(result2)