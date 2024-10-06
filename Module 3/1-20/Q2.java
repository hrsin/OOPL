import java.io.File;
import java.util.Scanner;
class Q2 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("The file extension you want: ");
        String ext = sc.nextLine();
        File folder = new File("edit/your/file/path"); // enter your file path here
        File[] files = folder.listFiles((dir, name)-> name.endsWith(ext));
        for (File file: files) {
            System.out.println(file.getName());
        }
        sc.close();
    }
}
