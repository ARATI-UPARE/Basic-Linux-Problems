#! /bin/bash

cd /var/log
for file in `find type -f -mtime +7`
 do
	mv $file cd /var/backups ;
 done
