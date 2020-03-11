
#! /bin/bash

# Get probability of two dice using RANDOM function.
 
d1=$(( RANDOM%6+1 ));
echo $d1;
d2=$(( RANDOM%6+1 ));
echo $d2;
echo $((d1+d2));

