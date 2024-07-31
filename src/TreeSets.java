import java.util.*;
public class TreeSets
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        TreeSet<Integer> t=new TreeSet<>();
        List<Integer>list=new ArrayList<>();
        while(true)
        {
            System.out.println("enter number to list if not wanted enter -1");
            int n=sc.nextInt();
            if(n==-1) break;
            t.add(n);
        }
        for(int i=0;i<list.size();i++)
        {
            t.add(list.get(i));
        }
        for(int j :t)
        {
            System.out.print(j+" ");
        }
    }
}
