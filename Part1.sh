#! /bin/bash

today=$(date +%s)
lab1DueDate=$(date -j -f "%Y/%m/%d" "2022/9/28" +%s)
lab2DueDate=$(date -j -f "%Y/%m/%d" "2022/10/26" +%s)
lab3DueDate=$(date -j -f "%Y/%m/%d" "2022/11/23" +%s)
lab4DueDate=$(date -j -f "%Y/%m/%d" "2022/12/7" +%s)
quiz1Date=$(date -j -f "%Y/%m/%d" "2022/9/14" +%s)
quiz2Date=$(date -j -f "%Y/%m/%d" "2022/9/28" +%s)
quiz3Date=$(date -j -f "%Y/%m/%d" "2022/10/26" +%s)
quiz4Date=$(date -j -f "%Y/%m/%d" "2022/11/16" +%s)
quiz5Date=$(date -j -f "%Y/%m/%d" "2022/12/7" +%s)
finalDate=$(date -j -f "%Y/%m/%d" "2022/12/19" +%s)

echo "What is the starting date?"
echo "(Pick from the list below or input a date in the form MM/DD/YYYY)"
echo "Saved Date: Today, Lab1DueDate, Lab2DueDate, Lab3DueDate, Lab4DueDate, Quiz1Date, Quiz2Date, Quiz3Date, Quiz4Date, Quiz5Date, FinalDate"

read input
date=$(tr '[:upper:]' '[:lower:]' <<< "$input")

case $date in
	today)
		startDate=today
		;;
	lab1duedate)
		startDate=lab1DueDate
		;;
        lab2duedate)
                startDate=lab2DueDate 
                ;;
        lab3duedate)
                startDate=lab3DueDate 
                ;;
        lab4duedate)
                startDate=lab4DueDate 
                ;;
	quiz1date)
		startDate=quiz1Date
		;;
        quiz2date)
                startDate=quiz2Date
                ;;
        quiz3date)
                startDate=quiz3Date
                ;;
        quiz4date)
                startDate=quiz4Date
                ;;
        quiz5date)
                startDate=quiz5Date
                ;;
        finaldate)
                startDate=finalDate
                ;;
	*)
		startDate=$(date -j -f "%m/%d/%Y" $input +%s)
		;;
esac

echo "What is the ending date?"
echo "(Pick from the list below or input a date in the form MM/DD/YYYY)"
echo "Saved Date: Today, Lab1DueDate, Lab2DueDate, Lab3DueDate, Lab4DueDate, Quiz1Date, Quiz2Date, Quiz3Date, Quiz4Date, Quiz5Date, FinalDate"

read input
date=$(tr '[:upper:]' '[:lower:]' <<< "$input")

case $date in
        today)
                endDate=today
                ;;
        lab1duedate)
                endDate=lab1DueDate
                ;;
        lab2duedate)
                endDate=lab2DueDate
                ;;
        lab3duedate)
                endDate=lab3DueDate
                ;;
        lab4duedate)
                endDate=lab4DueDate
                ;;
        quiz1date)
                endDate=quiz1Date
                ;;
        quiz2date)
                endDate=quiz2Date
                ;;
        quiz3date)
                endDate=quiz3Date
                ;;
        quiz4date)
                endDate=quiz4Date
                ;;
        quiz5date)
                endDate=quiz5Date
                ;;
        finaldate)
                endDate=finalDate
                ;;
        *)
                endDate=$(date -j -f "%m/%d/%Y" $input +%s)
                ;;
esac

echo "There are" $((($endDate-$startDate)/(60*60*24))) "days between those two days"
