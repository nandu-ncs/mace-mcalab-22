def bin(d):
    if not d:
        return ''
    else:
        return str(bin(d//2))+str(d%2)
n=int(input("Enter a decimal number : "))
print("Binary : ",bin(n))