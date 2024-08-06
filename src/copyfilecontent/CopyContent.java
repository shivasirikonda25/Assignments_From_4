package copyfilecontent;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class CopyContent
{
    public static void main(String[] args)
    {
         String res="";
        try(FileReader read=new FileReader("C:\\Users\\Sirikonda.Shiva\\IdeaProjects\\DAY-11\\src\\copyfilecontent\\source"))
        {
            int character;
            while((character= read.read())!=-1)
            {
                res=res+""+(char)(character);
            }
        }  catch (IOException e) {
            throw new RuntimeException(e);
        }
        try(FileWriter write=new FileWriter("C:\\Users\\Sirikonda.Shiva\\IdeaProjects\\DAY-11\\src\\copyfilecontent\\destination.txt"))
        {
            write.write(res);
        }  catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
