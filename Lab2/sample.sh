#! /bin/bash

source ./build.sh

echo "calling java program for date calculator using build.sh"
compileAndRun

echo "calling bash version of the date calculator"
chmod +x Part1.sh
./Part1.sh < input.txt
