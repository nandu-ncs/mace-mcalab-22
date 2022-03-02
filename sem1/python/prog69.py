in1=in2=in3=False
try:
    in1=open('num.txt','r')
    in2=open('odd.txt','w+')
    in3=open('even.txt','w+')
    nums=in1.readlines()
    for x in nums:
        if not int(x)%2:
            in3.writelines(x)
        else:
            in2.writelines(x)
    print("\nodd.txt")
    in2.seek(0,0)
    print(in2.read())
    print("\neven.txt")
    in3.seek(0,0)
    print(in3.read())
except IOError as io:
    print(io)
finally:
    if in1:in1.close()
    if in2:in2.close()
    if in3:in3.close()