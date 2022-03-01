n=input("Enter the numbers : ")
n=list(map(int,n.split()))
print([num for num in n if num>0])