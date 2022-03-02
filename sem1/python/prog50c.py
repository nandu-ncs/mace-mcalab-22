l=list(input("Enter the list of strings : ").split())
print(list(filter(lambda x: len(x)>=5,l)))

