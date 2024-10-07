import java.io.*;
import java.util.ArrayList;
class Q2 {
    public static void main(String[] args) {
        ArrayList<String> lines = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\Harsh\\OneDrive\\Desktop\\smt.txt"))) {
            String line;
            while((line = br.readLine()) != null) {
                lines.add(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(lines);
    }
}
