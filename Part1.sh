#! /bin/bash

today=$(date +%s)
lab1DueDate=$(date -j 092823592022 +%s)
lab2DueDate=$(date -j 102623592022 +%s)
lab3DueDate=$(date -j 112323592022 +%s)
lab4DueDate=$(date -j 120723592022 +%s)

echo Date until Lab 1 Due Date: $((($lab1DueDate-$today)/(60*60*24)))
echo Date until Lab 2 Due Date: $((($lab2DueDate-$today)/(60*60*24)))
echo Date until Lab 3 Due Date: $((($lab3DueDate-$today)/(60*60*24)))
echo Date until Lab 4 Due Date: $((($lab4DueDate-$today)/(60*60*24)))
