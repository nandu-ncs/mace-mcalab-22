try:
    n=int(input("Enter an integer : "))
    if n<90 or n>120:
        raise ValueError("Abnormal Condition")
except ValueError as e:
    print(e)