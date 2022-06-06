echo "Enter a number"
read n
f=1
while [ $n -ge 1 ]
do
f=$(($f * $n))
n=$(($n - 1))
done
echo "FACTORIAL  : $f"
