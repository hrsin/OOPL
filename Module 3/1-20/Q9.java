import java.util.Scanner;
class Q2 {
    public static void checkVowels(String input) throws Exception {
        if (!input.matches(".*[aeiouAEIOU].*")) {
            throw new Exception("No vowels found in the string");
        }
        System.out.println("Vowels found in the string");

    }
    public static void main(String[] args) {
        System.out.println("Enter a string: ");
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        try {
            checkVowels(input);
        } catch (Exception e) {
            System.out.println("Exception Handled: " + e.getMessage());
        }
        sc.close();
    }
}
