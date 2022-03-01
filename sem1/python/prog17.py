s=input("Enter the word : ")
w={}
for a in s.lower():
    w[a]=w.get(a,0)+1
print(w)