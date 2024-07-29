import java.util.*;
public class LinearSearch
{
    public static void search(int[] arr,int t)
    {
        int n=arr.length;
        int ind=-1;
        for(int i=0;i<n;i++)
        {
            if(arr[i]==t)
            {
                ind=i;
            }
        }
        System.out.println("the index of the target is" +ind);
    }
    public static void search1(String[] arr,String t)
    {
        int n=arr.length;
        int ind=-1;
        for(int i=0;i<n;i++)
        {
            if(arr[i].equals(t))
            {
                ind=i;
            }
        }
        System.out.println("the index of the target string is" +ind);
    }
    public static void firstOccurence(List<Integer> l,int t)
    {
        for(int i=0;i<l.size();i++)
        {
            if(l.get(i)==t)
            {
                System.out.println("the index of the list"+i);
                return;
            }
        }
        System.out.println("number not existed ");
    }
    public static void count(String s,char c)
    {
        int cnt=0;
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)==c) cnt++;
        }
        System.out.println("count of the character"+c+"is :"+cnt);
    }
    public static void alloccur(int[] arr,int t)
    {
        List<Integer> l=new ArrayList<>();
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==t)l.add(i);
        }
        System.out.println("All indices of "+t);
        for(int i=0;i<l.size();i++) System.out.print(l.get(i)+" ");
    }
    public static void firstnonduplicate(String s)
    {
        HashMap<Character,Integer> cnt=new HashMap<>();
        for(int i=0;i<s.length();i++)
        {
            cnt.put(s.charAt(i),cnt.getOrDefault(s.charAt(i),0)+1);
        }
        for(int i=0;i<s.length();i++)
        {
            if(cnt.get(s.charAt(i))==1)
            {
                System.out.println("non duplicate number is :"+s.charAt(i));
                return;
            }
        }
        System.out.println("all are duplicate numbers");
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the array size");
        int n=sc.nextInt();
        int[] arr=new int[n];
        String[] s=new String[n];
        System.out.println("enter the array elements");
        int max=Integer.MIN_VALUE;
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
            max=Math.max(max,arr[i]);
        }
        System.out.println("enter the target");
        int t=sc.nextInt();
        search(arr,t);
        System.out.println("the maximum number is :"+max);
        System.out.println("enter the array of string :");
        for(int i=0;i<n;i++) s[i]=sc.next();
        System.out.println("enter the target string");
        String t1=sc.next();
        search1(s,t1);
        List<Integer>l=new ArrayList<>();
        System.out.println("enter the list elements :");
        for(int i=0;i<n;i++) l.add(sc.nextInt());
        System.out.println("enter the target ");
        int t2=sc.nextInt();
        firstOccurence(l,t2);
        System.out.println("enter the string :");
        String s2=sc.next();
        System.out.println("enter the character of the :");
        char c=sc.next().charAt(0);
        count(s2,c);
        System.out.println("enter the array size");
        int n1=sc.nextInt();
        int[] arr1=new int[n1];
        System.out.println("enter the array elements");
        for(int i=0;i<n1;i++) arr1[i]=sc.nextInt();
        System.out.println("enter the target");
        int t3=sc.nextInt();
        alloccur(arr1,t3);
        System.out.println("enter the string to find non duplicate numbers :");
         String str1=sc.next();
        firstnonduplicate(str1);



    }

}
