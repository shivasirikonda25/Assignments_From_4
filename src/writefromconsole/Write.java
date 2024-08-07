package writefromconsole;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;
public class Write {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        try (FileWriter write = new FileWriter("C:\\Users\\Sirikonda.Shiva\\IdeaProjects\\DAY-11\\src\\writefromconsole\\writing.txt")) {
            write.write(s);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
