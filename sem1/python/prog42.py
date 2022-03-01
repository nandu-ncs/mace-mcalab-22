n=list(input("Enter the words  : ").split())
m=[]
i=0
while i<len(n):
    if n[i] not in m:
        m.append(n[i])
    i+=1
m.sort()
print(m)