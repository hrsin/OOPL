import java.io.File;
class Q4 {
    public static void main(String[] args) {
        File file = new File("C:\\Users\\Harsh\\OneDrive\\Documents\\0. kjsce\\Orion");
        if (file.exists()) {
            if (file.isDirectory()) {
                System.out.println("It is a directory");
            } else {
                System.out.println("It is a file");
            }
            System.out.println("Writeable: " + file.canWrite());
            System.out.println("Readable " + file.canRead());
        } else {
            System.out.println("The path does not exist");
        }
    }
}
