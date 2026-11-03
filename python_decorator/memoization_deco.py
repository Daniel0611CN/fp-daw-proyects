def memoize(func):
    cache = {}

    def wrapper(*args):
        if args in cache:
            print(f"Fetching from cache for args: {args}")
            return cache[args]
        result = func(*args)
        cache[args] = result
        print(f"Caching result for args: {args}")
        return result

    return wrapper

@memoize
def fibonacci(n):
    if n < 2:
        return n
    return fibonacci(n - 1) + fibonacci(n - 2)

# Usage
print(fibonacci(10))  # First call, computes and caches
print(fibonacci(10))  # Second call, fetches from cache
