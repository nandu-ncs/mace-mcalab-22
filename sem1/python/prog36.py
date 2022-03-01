n=list(map(int,input("Enter the lits of numbers : ").split()))
for i in range(len(n)):
    if n[i]>100:
        n[i]='Over'
print(n)