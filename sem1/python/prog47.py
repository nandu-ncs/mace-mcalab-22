from re import L


def word(w,n):
    i=0
    l=[]
    while i<n:
        l.append(w)
        i+=1
    return l
w=input("Enter word : ")
n=int(input("Enter count : "))
l=word(w,n)
while l:
    print(l.pop(0))
            