c1=list(map(str,input("Enter color list 1 : ").lower().split()))
c2=list(map(str,input("Emter color list 2 : ").lower().split()))
print(set(c1)-set(c2))