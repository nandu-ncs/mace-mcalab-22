def sum(n):
    if n==1:
        return 1
    else:
        return n+sum(n-1)
num=int(input("Enter value for n : "))
print("Sum =",sum(num-1))