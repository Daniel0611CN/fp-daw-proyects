from decimal import Decimal

# Incorrect calculation with float
result_float = 0.1 + 0.2
print(f"Float result: {result_float}")  # Unexpected output: 0.30000000000000004

# Correct calculation with Decimal
result_decimal = Decimal('0.1') + Decimal('0.2')
print(f"Decimal result: {result_decimal}")  # Exact output: 0.3