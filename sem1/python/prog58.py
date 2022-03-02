c=u=l=d=s=0
p=input("Enter password : ")
for x in p:
    if x.isalnum():
        if x.isalpha():
            if x.islower():
                l+=1
            if x.isupper():
                u+=1
        if x.isdigit():
            d+=1
    else:
        s+=1
if len(p)<6:
    print("Minimum length should be 6")
    c+=1
if len(p)>16:
    print("Maximum length should be 16")
    c+=1
if not p[0].isalnum():
    print("Should start with character or digit")
    c+=1
if u==0:
    print("Atleast one uppercase character needed")
    c+=1
if l==0:
    print("Atleast one lowercase character needed")
    c+=1
if d==0:
    print("Atleast one digit is needed")
    c+=1
if s==0:
    print("Atleast one symbol needed")
    c+=1
if c==0:
    print("Password is valid")