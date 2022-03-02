def check(x,y):
    return(x==y,x+y==5,max(x,y)-min(x,y)==5)
a=int(input("Enter first number : "))
b=int(input("Enter second number : "))
t=check(a,b)
if t[0]:
    print("are equal")
else:
    print("are not equal")
if t[1]:
    print("Sum is 5")
else:
    print("Sum is not 5")
if t[2]:
    print("Difference is 5")
else:
    print("Difference is not 5")