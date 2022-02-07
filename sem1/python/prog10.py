sen=input("Enter the sentance : ")
n=""
for x in sen:
    if(x.isalpha() or x==' '):
        n+=x
print(len(n.split()))