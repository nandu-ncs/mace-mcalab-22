s=input("Enter the sentance : ")
if 'not bad' in s.lower():
    print(s.lower().replace('not bad','good',1))