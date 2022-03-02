in1=False
try:
    in1=open('abc3.txt','r')
    lines=in1.readlines()
    in1.seek(0,0)
    print(in1.read())
    print("\nNo: of lines : ",len(lines))
except IOError as io:
    print(io)
finally:
    if in1:in1.close()