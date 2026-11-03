from decimal import Decimal

# Define two Decimal numbers
num1 = Decimal('10.75')
num2 = Decimal('4.50')

# 1. Addition
addition = num1 + num2
print(f"Addition: {num1} + {num2} = {addition}")

# 2. Subtraction
subtraction = num1 - num2
print(f"Subtraction: {num1} - {num2} = {subtraction}")

# 3. Multiplication
multiplication = num1 * num2
print(f"Multiplication: {num1} * {num2} = {multiplication}")

# 4. Division
division = num1 / num2
print(f"Division: {num1} / {num2} = {division}")

# 5. Exponentiation (Power)
exponentiation = num1 ** Decimal('2')
print(f"Exponentiation: {num1} ** 2 = {exponentiation}")

# 6. Modulo
modulo = num1 % num2
print(f"Modulo: {num1} % {num2} = {modulo}")

# 7. Floor Division
floor_division = num1 // num2
print(f"Floor Division: {num1} // {num2} = {floor_division}")
