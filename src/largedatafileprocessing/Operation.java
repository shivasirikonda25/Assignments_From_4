package largedatafileprocessing;

import java.io.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Operation
{
    static List<Transactions> list=new ArrayList<>();
    public static void add()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the transcation id :");
        int tr=sc.nextInt();
        System.out.println("enter the customer id :");
        int cs=sc.nextInt();
        System.out.println("enter the transaction amount :");
        long am=sc.nextLong();
        System.out.println("enter current date");
        Date d1=new Date();
        Transactions t=new Transactions(tr,cs,am,d1);
        list.add(t);
    }

    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
       while(true)
       {
           System.out.println("enter -1 to exit");
           int h=sc.nextInt();
           if(h==-1) break;
           add();
       }
        try(BufferedWriter br=new BufferedWriter(new FileWriter("C:\\Users\\Sirikonda.Shiva\\IdeaProjects\\DAY-11\\src\\largedatafileprocessing\\writetransaction")))
        {
            for(int i=0;i<list.size();i++)
            {
                String str=list.get(i).toString();
                br.write(str);
                br.newLine();
            }
        }  catch (IOException e) {
            throw new RuntimeException(e);
        }
        try(BufferedReader br=new BufferedReader(new FileReader("C:\\Users\\Sirikonda.Shiva\\IdeaProjects\\DAY-11\\src\\largedatafileprocessing\\writetransaction")))
        {
            String s;
            while((s=br.readLine())!=null)
            {
                System.out.println(s);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        long threshold=sc.nextLong();
        List<Transactions> res=list.stream().filter(p->p.getAmount()>threshold).collect(Collectors.toList());
        try(BufferedWriter bw=new BufferedWriter(new FileWriter("C:\\Users\\Sirikonda.Shiva\\IdeaProjects\\DAY-11\\src\\largedatafileprocessing\\Filtered.txt")))
        {
            for(Transactions j : res)
            {
                bw.write(j.toString());
                bw.newLine();
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}

