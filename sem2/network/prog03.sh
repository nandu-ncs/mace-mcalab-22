#!/bin/bash
x=10
y=5
if [[ $x -gt $y ]]; then
	echo "$x is greater than $y"
elif [[ $x -lt $y ]]; then
	echo "$x is less than $y"
else
	echo "$x is equal to $y"
fi
