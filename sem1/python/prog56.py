def rev(st):
    if len(st)==1:
        return st[-1]
    else:
        return st[-1]+rev(st[:-1])
s=input("Enter string : ")
print("Reverse : ",rev(s))