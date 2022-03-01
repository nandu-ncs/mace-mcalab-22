l=list(map(int,input("Enter the list of numbers : ").split()))
s=0
for i in range(len(l)):
    s+=l[i]
print("Sum = ",s)