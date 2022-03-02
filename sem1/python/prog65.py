in1=False
in2=False
try:
    in1=open('abc.txt','r+')
    in2=open('xyz.txt','r')
    in1.read()
    in1.write('\n'+in2.read())
    in1.seek(0,0)
    print("New file : ")
    print(in1.read())
except IOError as io:
    print(io)
finally:
    if in1:in1.close()
    if in2:in2.close()