def count_calls(func):
    def wrapper(*args, **kwargs):
        wrapper.calls += 1
        print(f"Call {wrapper.calls} to {func.__name__}")
        return func(*args, **kwargs)
    
    wrapper.calls = 0
    return wrapper

@count_calls
def say_hello():
    print("Hello!")

# Usage
say_hello()  # Call 1
say_hello()  # Call 2
