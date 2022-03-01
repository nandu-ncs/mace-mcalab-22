l=list(input("Enter 4 digit binary numbers : ").split(','))
while l:
    x=l.pop()
    if not int(x,2)%5:
        print(x,end=',')