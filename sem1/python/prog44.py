l=list(map(int,input("Enter list of numbers : ").split()))
odd=even=i=0
while i<len(l):
    if l[i]%2:
        odd+=1
    else:
        even+=1
    i+=1
print("No: of even numbers : ",even)
print("No: of odd numbers : ",odd)