def role_required(role):
    def decorator(func):
        def wrapper(user, *args, **kwargs):
            if user.get("role") != role:
                print(f"Access denied for user: {user['name']}")
                return None
            return func(user, *args, **kwargs)
        return wrapper
    return decorator

@role_required('admin')
def delete_user(user, user_id):
    print(f"User {user_id} has been deleted by {user['name']}")

# Usage
admin = {"name": "Alice", "role": "admin"}
guest = {"name": "Bob", "role": "guest"}

delete_user(admin, 123)  # Allowed
delete_user(guest, 123)  # Access denied
