import java.util.Scanner;
class Q1 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter numerator: ");
        float a = sc.nextFloat();
        System.out.print("Enter denominator: ");
        float b = sc.nextFloat();
        float result = a/b;
        try {
            if (b>0) {
                System.out.println("A/B is: "+ result);
            } else {
                throw new ArithmeticException("Denominator cannot be 0");
            }
        } catch(ArithmeticException e) {
            System.out.println("Exception Handled: " + e);
        }
    }
}
