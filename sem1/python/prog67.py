in1=False
try:
    in1=open('abc3.txt','r+')
    lines=in1.readlines()
    n=int(input("Enter the line number to remove : "))
    lines.pop(n-1)
    in1.truncate(0)
    in1.seek(0,0)
    in1.writelines(lines)
    in1.close()
    in1=open('abc3.txt','r')
    print(in1.read())
except IOError as io:
    print(io)
    