package readanddisplay;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadDisplay
{
    public static void main(String[] args) {
        try(FileReader r=new FileReader("C:\\Users\\Sirikonda.Shiva\\IdeaProjects\\DAY-11\\src\\readanddisplay\\input.txt"))
        {
            int character;
            while((character=r.read())!=-1)
            {
                System.out.print((char)(character));
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
