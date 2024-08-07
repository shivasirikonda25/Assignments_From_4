package reversefilecontent;

import java.io.*;
import java.util.Scanner;

public class Reverse
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        StringBuilder sb=new StringBuilder();
        try(BufferedReader br =new BufferedReader(new FileReader("C:\\Users\\Sirikonda.Shiva\\IdeaProjects\\DAY-11\\src\\reversefilecontent\\content.txt")))
        {
            String s;
            while((s=br.readLine())!=null)
            {
                sb.append(s);
            }

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        try(BufferedWriter bw=new BufferedWriter(new FileWriter("C:\\Users\\Sirikonda.Shiva\\IdeaProjects\\DAY-11\\src\\reversefilecontent\\reversecontent.txt")))
        {
            System.out.println("write the content the file ");
            String str=sb.reverse().toString();
            bw.write(str);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
