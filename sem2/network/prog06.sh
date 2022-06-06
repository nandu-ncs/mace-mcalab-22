echo "Enter a number"
read a

if [ $(($a % 2))  -eq 0 ]
then 
echo "Given no is even"
else
echo "Given number is odd"
fi

