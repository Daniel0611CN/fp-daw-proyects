from decimal import Decimal

# Define currency amounts
price = Decimal('1.1')
tax_rate = Decimal('0.075')
quantity = Decimal('3')

# Calculate total price
total_price = price * quantity
tax = total_price * tax_rate
total_with_tax = total_price + tax
print(f"Total price (with tax): {total_with_tax}")

# Without using Decimal
total_price_float = 1.1 * 3
tax_float = total_price_float * 0.075
total_with_tax_float = total_price_float + tax_float

print(f"Total price (float, with tax): {total_with_tax_float}")

