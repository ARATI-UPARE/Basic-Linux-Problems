#! /bin/bash

mypid= ps -elf | grep java | grep -v grep | awk '{print $4}';
sudo kill $mypid;
