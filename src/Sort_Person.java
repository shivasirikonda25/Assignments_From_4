import java.sql.SQLOutput;
import java.util.*;
public class Sort_Person
{
    public static void main(String[] args)
    {
        List<Person>l=new ArrayList<>();
        Scanner sc=new Scanner(System.in);
        while(true)
        {
            System.out.println("enter -1 to exit ");
            int t=sc.nextInt();
            if(t==-1) break;
            System.out.println("enter the name of the person :");
            String name=sc.next();
            System.out.println("enter the age of the person");
            int age=sc.nextInt();
            System.out.println("enter the salary of the person");
            long salary=sc.nextLong();
            Person p=new Person(name,age,salary);
            l.add(p);
        }
        Collections.sort(l,(p1,p2)->{
            if(p1.age>p2.age) return 1;
            else return -1;
        });
        for(int i=0;i<l.size();i++) System.out.println(l.get(i));
    }
}
