#!/bin/bash
echo "Enter a string : "
read str 
len=`echo $str | wc -c`
len=`expr $len - 1`
i=1
j=`expr $len / 2 `
while [ $i -le $j ] 
do
	a=`echo $str | cut -c $i`
	b=`echo $str | cut -c $j` 
	if  test $a != $b	
	then
		echo "not Palin"
	 	exit
	fi
	i=`expr $i + 1`
	j=`expr $j - 1`
done
echo "Palin"
