#! /bin/bash

# Read two digit five random numbers .
# find additon and average of those numbers.


n1=$(((RANDOM%90)+10));

n2=$(((RANDOM%90)+10));

n3=$(((RANDOM%90)+10));

n4=$(((RANDOM%90)+10));

n5=$(((RANDOM%90)+10));

sum=$(($n1 + $n2 + $n3 + $n3 +$n4 +$n5 ));
echo "sum of numbers is " $sum;
avg=$((( $n1 + $n2 + $n3 + $n3 +$n4 +$n5) /5));
echo "Average of numbers is " $avg;
