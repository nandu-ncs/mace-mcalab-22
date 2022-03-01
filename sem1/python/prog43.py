s=list(input("Enter the sentance : ").split())
i=c=0
while i<len(s):
    if i<len(s[i])>=2 and (s[i][0].lower()==s[i][-1].lower()):
        c+=1
    i+=1
print("Count : ",c)