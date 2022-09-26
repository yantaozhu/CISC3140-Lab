import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Task4 {
    public static void main(String args[]) {
        LocalDate today = LocalDate.now();
        LocalDate lab1duedate = LocalDate.of(2022,9,28);
        LocalDate lab2duedate = LocalDate.of(2022,10,26);
        LocalDate lab3duedate = LocalDate.of(2022,11,23);
        LocalDate lab4duedate = LocalDate.of(2022,12,7);

        System.out.println("Days until Lab 1 due date: " + ChronoUnit.DAYS.between(today,lab1duedate));
        System.out.println("Days until Lab 2 due date: " + ChronoUnit.DAYS.between(today,lab2duedate));
        System.out.println("Days until Lab 3 due date: " + ChronoUnit.DAYS.between(today,lab3duedate));
        System.out.println("Days until Lab 4 due date: " + ChronoUnit.DAYS.between(today,lab4duedate));
    }
}