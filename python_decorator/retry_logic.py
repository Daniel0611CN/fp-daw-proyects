import time
import random

def retry(times, delay=1):
    def decorator(func):
        def wrapper(*args, **kwargs):
            for attempt in range(times):
                try:
                    return func(*args, **kwargs)
                except Exception as e:
                    print(f"Attempt {attempt + 1} failed: {e}")
                    time.sleep(delay * (2 ** attempt))  # Exponential backoff
            raise Exception(f"Failed after {times} retries")
        return wrapper
    return decorator

@retry(times=3, delay=1)
def unreliable_operation():
    if random.choice([True, False]):
        raise ValueError("Random failure")
    print("Operation succeeded")

# Usage
unreliable_operation()
