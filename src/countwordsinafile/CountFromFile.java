package countwordsinafile;

import java.io.*;
import java.util.Scanner;

public class CountFromFile
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
//        String str=sc.next();
//        try(FileWriter file =new FileWriter("C:\\Users\\Sirikonda.Shiva\\IdeaProjects\\DAY-11\\src\\countwordsinafile\\shiva.txt"))
//        {
//             file.write(str);
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }
        int res=0;
         try(BufferedReader br=new BufferedReader(new FileReader("C:\\Users\\Sirikonda.Shiva\\IdeaProjects\\DAY-11\\src\\countwordsinafile\\shiva.txt")))
         {
              String line;
              while((line=br.readLine())!=null)
              {
                  String[] w=line.split("\\s+");
                  res+=w.length;
              }
         } catch (FileNotFoundException e) {
             throw new RuntimeException(e);
         } catch (IOException e) {
             throw new RuntimeException(e);
         }
        System.out.println("no of words int he file"+ res);

    }
}
