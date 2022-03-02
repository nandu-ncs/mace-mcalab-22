class validate(Exception):pass
try:
    username="nandu23"
    password="123@NCS"
    u=input("Enter Username  : ")
    p=input("Enter Password : ")
    if u!=username or p!=password:
        raise validate("Invalid login credentials")
    else:
        print("Login Success")
except validate as e:
    print(e)