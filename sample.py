def add(x, y):
  return x + y

def subtract(x, y):
  return x - y

def multiply(x, y):
  return x * y

def divide(x, y):
  return x / y

def main():
  # Get two numbers from the user
  num1 = int(input("Enter the first number: "))
  num2 = int(input("Enter the second number: "))

  # Print the results of the operations
  print("The sum is:", add(num1, num2))
  print("The difference is:", subtract(num1, num2))
  print("The product is:", multiply(num1, num2))
  print("The quotient is:", divide(num1, num2))

if __name__ == "__main__":
  main()
