d={'name':'Nandu','course':'MCA','sem':1}
k=input("Enter key to check : ")
if(k in d.keys()):
    print("Key already exists")
else:
    print("Key dosen't exists")