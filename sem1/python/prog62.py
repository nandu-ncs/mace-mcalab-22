import calendar
from time import strftime,localtime
calendar.setfirstweekday(6)
print(calendar.month(2022,1))
print(strftime("%A, %d %B %Y %I:%M:%S %p %Z",localtime()))