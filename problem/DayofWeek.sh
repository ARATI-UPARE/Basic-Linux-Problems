#! /bin/bash

# WAP to Take input from user as input argument of function D/M/YY and find the DAY of WEEK using given formula.
D=$1
m=$2
y=$3

y0=$(( y -( 14 - m ) / 12 ))
X=$(( y0 + y0 / 4 - y0 / 100 + y0 / 400))
m0=$(( m + 12 * (( 14 - m ) / 12 ) - 2 ))
d0=$((( D + X + 31 * m0 / 12 ) % 7 ))

if [ $d0 == 0 ]
then
	echo Its sunday
elif [ $d0 == 1 ]
then
	echo Its Monday
elif [ $d0 == 2 ]
then
        echo Its Tuesday
elif [ $d0 == 3 ]
then
        echo Its Wednesday
elif [ $d0 == 4 ]
then
        echo Its Thursday
elif [ $d0 == 5 ]
then
        echo Its Friday
else 
        echo Its Saturday
fi
