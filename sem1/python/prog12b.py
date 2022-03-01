n=input("Enter the numbers : ")
n=list(map(int,n.split()))
print([num*num for num in n])