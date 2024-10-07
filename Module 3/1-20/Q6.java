import java.io.File;
class Q6 {
    public static void main(String[] args) {
        File file =  new File("Enter/your/file/path/here"); // replace with your file path
        if(file.exists()) {
            long bytes = file.length();
            double kb = (double)bytes/1024;
            double mb = kb/1024;
            System.out.println("File size in bytes: " + bytes);
            System.out.println("File size in KB: " + kb);
            System.out.println("File size in MB: " + mb);
        } else {
            System.out.println("File does not exist");
        }
    }
}
