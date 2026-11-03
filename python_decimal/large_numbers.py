from decimal import Decimal, getcontext

# Increase precision to handle very large numbers
getcontext().prec = 101

large_number = Decimal('1e50')
small_number = Decimal('1e-50')

result = large_number + small_number
print(result)  # Precision will be preserved