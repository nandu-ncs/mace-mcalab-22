sen=input("Enter the sentance : ")
c=0
for x in sen:
    if x.lower() in 'aeiou':
        c+=1
print("Number of vowels : ",c)