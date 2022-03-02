try:
    a=int(input("Enter first integer : "))
    b=int(input("Enter second integer :"))
    print(a/b)
except ZeroDivisionError as e:
    print("Division by zero error : ",e)
except ValueError as e:
    print("Non integer value entered : ",e)