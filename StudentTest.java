import java.util.Scanner;

public class StudentTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter Roll No: ");
            int rollNo = sc.nextInt();
            sc.nextLine(); // clear buffer

            System.out.print("Enter Name: ");
            String name = sc.nextLine();

            System.out.print("Enter Age: ");
            int age = sc.nextInt();
            sc.nextLine();

            System.out.print("Enter Course: ");
            String course = sc.nextLine();

            Student s = new Student(rollNo, name, age, course);
            System.out.println("\nStudent Created Successfully\n");
            s.display();

        } catch (AgeNotWithinRangeException e) {
            System.out.println(e.getMessage());

        } catch (NameNotValidException e) {
            System.out.println(e.getMessage());
        }
    }
}
