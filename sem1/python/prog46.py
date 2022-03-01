def add(a):
    if a.startswith('Is'):
        return a
    else:
        return 'Is'+a
s=input("Enter string : ")
print(add(s))