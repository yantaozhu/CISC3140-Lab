import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Part1 {
	public static void main(String[] args) {
		LocalDate today = LocalDate.now();
		LocalDate lab1DueDate = LocalDate.of(2022,9,28);
                LocalDate lab2DueDate = LocalDate.of(2022,10,26);
                LocalDate lab3DueDate = LocalDate.of(2022,11,23);
                LocalDate lab4DueDate = LocalDate.of(2022,12,7);
                LocalDate quiz1Date = LocalDate.of(2022,9,14);
                LocalDate quiz2Date = LocalDate.of(2022,9,28);
                LocalDate quiz3Date = LocalDate.of(2022,10,26);
                LocalDate quiz4Date = LocalDate.of(2022,11,16);
                LocalDate quiz5Date = LocalDate.of(2022,12,7);
                LocalDate finalDate = LocalDate.of(2022,12,19);
		LocalDate startDate = LocalDate.of(1,1,1);
		LocalDate endDate = LocalDate.of(1,1,1);
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("M/d/yyy");
		String input;
		boolean acceptedInput;
		long dayBetweenDates;

		Scanner sc = new Scanner(System.in); //create a scanner

		acceptedInput = false;
		while(!acceptedInput) {
			System.out.println("What is the starting date?");
			System.out.println("(Pick from the list below or input a date in the form MM/DD/YYYY)");
			System.out.println("Saved Date: Today, Lab1DueDate, Lab2DueDate, Lab3DueDate, Lab4DueDate, Quiz1Date, Quiz2Date, Quiz3Date, Quiz4Date, Quiz5Date, FinalDate");
//prompt the user for input.
			input = sc.nextLine();
			try {
				switch (input.toLowerCase()) {
//check if the input is accepted, if not it will have an exception.
					case "today":
						startDate = today; //set today as the starting date if the input match the case string.
						acceptedInput = true; //stop the while loop to happen again since we have a valid input.
						break; //stop the switch
					case "lab1duedate":
						startDate = lab1DueDate;
                                                acceptedInput = true;
                                                break;
                                        case "lab2duedate":
                                                startDate = lab2DueDate;
                                                acceptedInput = true;
                                                break;
                                        case "lab3duedate":
                                                startDate = lab3DueDate;
                                                acceptedInput = true;
                                                break;
                                        case "lab4duedate":
                                                startDate = lab4DueDate;
                                                acceptedInput = true;
                                                break;
                                        case "quiz1date":
                                                startDate = quiz1Date;
                                                acceptedInput = true;
                                                break;
                                        case "quiz2date":
                                                startDate = quiz2Date;
                                                acceptedInput = true;
                                                break;
                                        case "quiz3date":
                                                startDate = quiz3Date;
                                                acceptedInput = true;
                                                break;
                                        case "quiz4date":
                                                startDate = quiz4Date;
                                                acceptedInput = true;
                                                break;
                                        case "quiz5date":
                                                startDate = quiz5Date;
                                                acceptedInput = true;
                                                break;
                                        case "finaldate":
                                                startDate = finalDate;
                                                acceptedInput = true;
                                                break;
					default:
						startDate = LocalDate.parse(input, formatter); //convert the input to a date based on the formatter.
						acceptedInput = true;
				}
			} catch (Exception e) {
//happen when there are an exception
				System.out.println("Unacceptable input. Try again.");
			}
		}
//while loop runs again if there is an exception, else it will ask the ending date.
                
		acceptedInput = false;
                while(!acceptedInput) {
                        System.out.println("What is the ending date?");
                        System.out.println("(Pick from the list below or input a date in the form MM/DD/YYYY)");
                        System.out.println("Saved Date: Today, Lab1DueDate, Lab2DueDate, Lab3DueDate, Lab4DueDate, Quiz1Date, Quiz2Date, Quiz3Date, Quiz4Date, Quiz5Date, FinalDate");
                        input = sc.nextLine();
                        try {
                                switch (input.toLowerCase()) {
                                        case "today":
                                                endDate = today;
                                                acceptedInput = true;
                                                break;
                                        case "lab1duedate":
                                                endDate = lab1DueDate;
                                                acceptedInput = true;
                                                break;
                                        case "lab2duedate":
                                                endDate = lab2DueDate;
                                                acceptedInput = true;
                                                break;
                                        case "lab3duedate":
                                                endDate = lab3DueDate;
                                                acceptedInput = true;
                                                break;
                                        case "lab4duedate":
                                                endDate = lab4DueDate;
                                                acceptedInput = true;
                                                break;
                                        case "quiz1date":
                                                endDate = quiz1Date;
                                                acceptedInput = true;
                                                break;
                                        case "quiz2date":
                                                endDate = quiz2Date;
                                                acceptedInput = true;
                                                break;
                                        case "quiz3date":
                                                endDate = quiz3Date;
                                                acceptedInput = true;
                                                break;
                                        case "quiz4date":
                                                endDate = quiz4Date;
                                                acceptedInput = true;
						break;
                                        case "quiz5date":
                                                endDate = quiz5Date;
                                                acceptedInput = true;
                                                break;
                                        case "finaldate":
                                                endDate = finalDate;
                                                acceptedInput = true;
                                                break;
                                        default:
                                                endDate = LocalDate.parse(input, formatter);
                                                acceptedInput = true;
                                }
                        } catch (Exception e) {
                                System.out.println("Unacceptable input. Try again.");
                        }
                }

		dayBetweenDates = ChronoUnit.DAYS.between(startDate,endDate);
//find the number of date between the first and second input, its negative if the second date is before first date.

		if (dayBetweenDates > 0) {
//run when the start date is before the end date.
			System.out.println(endDate + " is " + dayBetweenDates + " days from " + startDate);
		}
		else if (dayBetweenDates < 0) {
//run when the end date is before the start date
			dayBetweenDates = -dayBetweenDates;
			System.out.println(endDate + " is " + dayBetweenDates + " days past " + startDate);
		}
	}
}
