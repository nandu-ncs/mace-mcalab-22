l=list(map(int,input("Enter the list of integers : ").split()))
print(list(map(lambda x:round(x*1.1,2) if x>1000 else round(x*1.05,2),l)))
