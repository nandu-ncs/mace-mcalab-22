names=input("Enter the names : ")
count=[x for x in names.split() if(x[0]=='a' or x[0]=='A')]
print(len(count))