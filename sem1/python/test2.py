from array import array
from random import *
import numpy
step_function=lambda x:0 if x<100 else 1

training_data=[
    (array('d',[0,0,1]),0),
    (array('d',[0,1,1]),0),
    (array('d',[1,0,1]),0),
    (array('d',[1,1,1]),1),
]

w=numpy.random.rand(3)
print(w)

errors=[]
eta=0.1
n=100000

for i in range(n):
    x,expected=choice(training_data)

    result=numpy.dot(w,x)
    error=expected-step_function(result)
    errors.append(error)
    w+=eta*error*x

for x,_ in training_data:
    result=numpy.dot(x,w)
    print("{}: {} -> {}".format(x[:3],result,step_function(result)))
