import java.util.Scanner;
import java.util.Stack;

public class StackProgram {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n1.Push\n2.Pop\n3.Check Empty\n4.Exit");
            System.out.print("Enter choice: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter element: ");
                    int x = sc.nextInt();
                    stack.push(x);
                    System.out.println("Element pushed");
                    break;

                case 2:
                    if (!stack.isEmpty()) {
                        System.out.println("Popped: " + stack.pop());
                    } else {
                        System.out.println("Stack is empty");
                    }
                    break;

                case 3:
                    System.out.println("Is stack empty? " + stack.isEmpty());
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
