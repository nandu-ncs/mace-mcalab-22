in1=False
try:
    in1=open('abc2.txt','r')
    lines=in1.readlines()
    lines.sort(key=len)
    in1.seek(0,0)
    print(in1.read())
    print("Longest line : ",lines[-1])
except IOError as io:
    print(io)
finally:
    if in1:in1.close()