#! /bin/bash

# Open data.csv file from linux-content.
# Print EmployeeName and Totalsalary if basesalary is greater than 10000


cat data.csv | awk '$4 > 10000 {print $2,$7}';







