def uppercase_decorator(func):
    def wrapper(*args, **kwargs):
        result = func(*args, **kwargs)
        return result.upper()
    return wrapper

def exclaim_decorator(func):
    def wrapper(*args, **kwargs):
        result = func(*args, **kwargs)
        return result + "!"

    return wrapper

@uppercase_decorator
@exclaim_decorator
def greet(name):
    return f"Hello, {name}"

# Usage
print(greet("Alice"))
