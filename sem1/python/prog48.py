def cal(x,y):
    return(x+y,x-y,x*y,x/y)
a=int(input("Enter first number : "))
b=int(input("Enter second number : "))
t=cal(a,b)
print("Sum = ",t[0])
print("Difference = ",t[1])
print("Product = ",t[2])
print("Division : ",t[3])