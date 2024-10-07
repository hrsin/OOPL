import java.util.Scanner;
class Q5 {
    public static void checkEven(int n) throws Exception {
        if (n%2!=0) {
            throw new Exception("Number is not even");
        }
        System.out.println("Number is even");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        try {
           checkEven(n);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        sc.close();
    }
}
