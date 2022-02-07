fyear=int(input("Enter year : "))
cyear=2021
x=[i for i in range(cyear,fyear+1) if((i%4==0 and i%100!=0) or (i%100==0 and i%400==0))]
print("Leap Year : ",x)