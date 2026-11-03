from decimal import Decimal, ROUND_HALF_UP

# Set up a decimal value and round it
value = Decimal('2.675')
rounded_value = value.quantize(Decimal('0.01'), rounding=ROUND_HALF_UP)

print(rounded_value)  # Rounds to 2.68


value = Decimal('2.6785')
rounded_value2 = value.quantize(Decimal('1.000'), rounding=ROUND_HALF_UP)
print(rounded_value2)  