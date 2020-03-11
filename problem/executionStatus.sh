#! /bin/bash

# Get execution status of command using $?
read -p "Enter command " cmd;
$cmd;
if [ $? == 0 ]
then
	echo "Command executed successfully";
else
	echo "Command not executed successfully";
fi


