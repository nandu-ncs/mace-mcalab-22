#!/bin/bash
if [[ -e /var/log/syslog ]] 
then
	cat /var/log/syslog | grep "^May"
else
	echo "File not found"
fi
