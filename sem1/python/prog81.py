class Person:
    def __init__(self):
        self.name=input("Enter name : ")
        self.phno=input("Enter phone number : ")
    def display(self):
        print("Employee Name : ",self.name)
        print("Phone number : ",self.phno)
class Dept:
    def __init__(self):
        self.department=input("Enter department name : ")
        self.location=input("Enter location : ")
    def display(self):
        print("Department : ",self.department)
        print("Location : ",self.location)
class Employee(Person,Dept):
    def __init__(self):
        super().__init__()
        Dept.__init__(self)
        self.designation=input("Enter designation : ")
        self.salary=int(input("Enter salary : "))
    def display(self):
        super().display()
        Dept.display(self)
        print("Designation : ",self.designation)
        print("Salary : ",self.salary)
    def __eq__(self,other):
        if(self.department==other.department):
            return True
        else:
            return False      
    def __ge__(self,other):
        if(self.salary>=other.salary):
            return True
        else:
            return False     
try:
    print("Enter details of employee 1")
    e1=Employee()
    e1.salary=round(e1.salary*1.10,2)
    print("\n__Employee1 Details__")
    e1.display()
    print("\nEnter details of employee 2")
    e2=Employee()
    print("\n__Employee2 Details__")
    e2.display()
    print()
    if(e1==e2):
        print("Same department")
    else:
        print("Different department")
    if(e1>=e2):
        print("Employee 1 has more salary")
    else:
        print("Employee 2 has more salary")
except Exception as e:
    print(e)
