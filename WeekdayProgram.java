import java.util.Scanner;

public class WeekdayProgram {
    public static void main(String[] args) {
        String[] days = {
            "Sunday", "Monday", "Tuesday",
            "Wednesday", "Thursday", "Friday", "Saturday"
        };

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter day index (0-6): ");
        int index = sc.nextInt();

        try {
            System.out.println("Day is: " + days[index]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid index. Enter value between 0 and 6.");
        }
    }
}
