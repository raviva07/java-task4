import java.util.Scanner;

public class VoterTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter Voter ID: ");
            int id = sc.nextInt();
            sc.nextLine();

            System.out.print("Enter Name: ");
            String name = sc.nextLine();

            System.out.print("Enter Age: ");
            int age = sc.nextInt();

            Voter v = new Voter(id, name, age);
            System.out.println("Voter registered successfully");

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
