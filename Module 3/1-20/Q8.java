import java.util.Scanner;
import java.util.Stack;
class Q8 {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        System.out.println("Enter the element to be searched");
        Scanner sc = new Scanner(System.in);
        int element = sc.nextInt();
        if (stack.contains(element)) {
            System.out.println("Element found in the stack.");
        } else {
            System.out.println("Element not found in the stack.");
        }
        sc.close();
    }
}
