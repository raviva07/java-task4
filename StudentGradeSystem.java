import java.util.HashMap;
import java.util.Scanner;

public class StudentGradeSystem {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n1.Add Student\n2.Remove Student\n3.Display Grade\n4.Exit");
            System.out.print("Enter choice: ");
            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter Student Name: ");
                    String name = sc.nextLine();
                    System.out.print("Enter Grade: ");
                    int grade = sc.nextInt();
                    map.put(name, grade);
                    System.out.println("Student added");
                    break;

                case 2:
                    System.out.print("Enter Student Name to remove: ");
                    String rname = sc.nextLine();
                    map.remove(rname);
                    System.out.println("Student removed");
                    break;

                case 3:
                    System.out.print("Enter Student Name: ");
                    String sname = sc.nextLine();
                    if (map.containsKey(sname)) {
                        System.out.println("Grade: " + map.get(sname));
                    } else {
                        System.out.println("Student not found");
                    }
                    break;

                case 4:
                    System.out.println("Exit");
                    return;

                default:
                    System.out.println("Invalid choice");
            }
        }
    }
}
