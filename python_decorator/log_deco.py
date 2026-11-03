
def log_decorator(func):
    def wrapper(*args, **kwargs):
        print(f"Function '{func.__name__}' is called")
        return func(*args, **kwargs)
    return wrapper

@log_decorator
def greet(name):
    print(f"Hello, {name}!")

# Usage
greet("Alice")
