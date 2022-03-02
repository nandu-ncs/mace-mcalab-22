def fact(f):
    if f==1:
        return 1
    else:
        return f*fact(f-1)
n=int(input("Enter an integer : "))
print("Factorial of ",n,":",fact(n))