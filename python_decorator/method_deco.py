def log_method_call(func):
    def wrapper(self, *args, **kwargs):
        print(f"Method '{func.__name__}' of class '{self.__class__.__name__}' is called")
        return func(self, *args, **kwargs)
    return wrapper

class Greeter:
    @log_method_call
    def greet(self, name):
        print(f"Hello, {name}!")

# Usage
g = Greeter()
g.greet("Alice")
