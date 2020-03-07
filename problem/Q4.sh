#! /bin/bash

#check file is present or not?
#if not then create file.

read -p "Enter file name " file;
if [ -f $file ]
then
	echo " File is already present";
else
 	touch $file;
	echo " New file is created";
fi



read -p "Enter folder name " foldername;
if [ -d $foldername ]
then
        echo " Folder is already present";
else
        mkdir $foldername;
        echo " New folder is created";
fi

