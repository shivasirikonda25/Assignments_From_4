import java.io.FileWriter;
import java.io.IOException;
import java.util.*;
public class Main {
    public static void main(String[] args)
    {
        try (FileWriter file=new FileWriter("destination.txt"))
        {
            Scanner sc=new Scanner(System.in);
            String s=sc.next();
            file.write(s);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}