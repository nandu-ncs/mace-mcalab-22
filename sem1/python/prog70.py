in1=False
try:
    in1=open('abc4.txt','r')
    words=in1.read().split()
    words.sort(key=len)
    in1.seek(0,0)
    print(in1.read(),"\n")
    l=len(words[-1])
    for x in words:
        if(len(x)==l):
            print(x)
except Exception as e:
    print(e)
finally:
    if in1:in1.close()