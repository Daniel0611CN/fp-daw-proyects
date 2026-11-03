def enforce_types(func):
    def wrapper(*args, **kwargs):
        annotations = func.__annotations__
        for arg, expected_type in annotations.items():
            if arg in kwargs and not isinstance(kwargs[arg], expected_type):
                raise TypeError(f"Argument '{arg}' must be of type {expected_type}")
        return func(*args, **kwargs)
    return wrapper

@enforce_types
def greet(name: str, age: int):
    print(f"Hello {name}, you are {age} years old")

# Usage
greet(name="Alice", age=30)  # Works fine
greet(name="Bob", age="thirty")  # Raises TypeError
