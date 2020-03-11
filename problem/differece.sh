#! /bin/bash -x

dif="$(diff original/org.sh updated/up.sh)"
echo $dif
if [[ $dif != 0 ]]
then
	cp original/org.sh original_backup/org.sh
	cp updated/up.sh original/org.sh
else
	echo No changes found in file
fi
