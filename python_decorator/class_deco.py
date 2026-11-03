def add_greeting_method(cls):
    cls.greet = lambda self: print(f"Hello from {self.__class__.__name__}!")
    return cls

@add_greeting_method
class MyClass:
    pass

# Usage
obj = MyClass()
obj.greet()
