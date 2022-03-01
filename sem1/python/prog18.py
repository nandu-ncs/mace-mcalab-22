l1=list(map(int,input("Enter list 1 : ").split()))
l2=list(map(int,input("Enter list 2 : ").split()))
if(len(l1)==len(l2)):
    print("Same length")
else:
    print("Different length")
if(sum(l1)==sum(l2)):
    print("Same sum")
else:
    print("Different sum")
if(set(l1)&set(l2)):
    print("Some values occur in both")
else:
    print("No common values")