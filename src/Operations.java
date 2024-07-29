import java.sql.SQLOutput;
import java.util.*;
public class Operations
{
    public static void add(int pn,String pm,String it,int ca,List<PolicyManagement>l)
    {
        l.add(new PolicyManagement(pn,pm,it,ca));
        System.out.println();
    }
    public static void delete(List<PolicyManagement>l,int policy_number)
    {
         for(int i=0;i<l.size();i++)
         {
             if(l.get(i).getPolicy_number()==policy_number)
             {
                 l.remove(i);
                 System.out.println("successfully deleted");
                 return;
             }
         }
        System.out.println("policy number is not existed");

    }
    public static void update(List<PolicyManagement>l,int policy_number)
    {
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<l.size();i++)
        {
            if(l.get(i).getPolicy_number()==policy_number)
            {
                while(true) {
                    System.out.println("what you wanted to edit");
                    System.out.println("enter 1: update policy number");
                    System.out.println("enter 2 to update policy holder name");
                    System.out.println("enter 3 to update policy type");
                    System.out.println("enter 4 to update to update coverage");
                    System.out.println("enter 5 to exit :");
                    int x = sc.nextInt();
                    if (x == 1) {
                        System.out.println("enter the updated policy number");
                        l.get(i).setPolicy_number(sc.nextInt());
                    } else if (x == 2) {
                        System.out.println("enter the updated policy holder name");
                        l.get(i).setPolicy_Holdername(sc.next());
                    } else if (x == 3) {
                        System.out.println("enter the updated insurance type");
                        l.get(i).setInsurance_type(sc.next());
                    } else if(x==4){
                        System.out.println("enter the updated coverage amount :");
                        l.get(i).setCoverage_amount(sc.nextInt());
                    }
                    else break;
                }

            }
        }
        System.out.println("policy number is not existed");
    }
    public static void main(String[] args)
    {
        List<PolicyManagement> l=new ArrayList<>();
        Scanner sc=new Scanner(System.in);
       while(true)
       {
           System.out.println("enter 1 to add a new policy");
           System.out.println("enter 2 to delete policy");
           System.out.println("enter 3 to update policy");
           System.out.println("enter 4 to exit ");
           int t=sc.nextInt();
           if(t==1)
           {
               System.out.println("enter policy number");
               int pn=sc.nextInt();
               System.out.println("enter the name of the policy holder name");
               String pm=sc.next();
               System.out.println("enter insurance type");
               String it=sc.next();
               System.out.println("enter coverage amount");
               int amt=sc.nextInt();
               add(pn,pm,it,amt,l);
           }
           else if(t==2)
           {
               System.out.println("enter the policy number to be deleted");
               int tar=sc.nextInt();
               delete(l,t);
               System.out.println("deleted........");
           }
           else if(t==3)
           {
               System.out.println("enter the policy number to be updated");
               int tar=sc.nextInt();
               update(l,t);
               System.out.println("updated........");
           }
           else break;
       }
       HashMap<String,List<PolicyManagement>>map=new HashMap<>();
       for(int i=0;i<l.size();i++)
       {
           if(!map.containsKey(l.get(i)))
           {
               map.put(l.get(i).getInsurance_type(),new ArrayList<>());
           }
           List<PolicyManagement>temp=map.get(l.get(i).getInsurance_type());
           temp.add(l.get(i));
           map.put(l.get(i).getInsurance_type(),temp);
       }
       for(Map.Entry<String,List<PolicyManagement>> m: map.entrySet())
       {
           List<PolicyManagement>temp=m.getValue();
           System.out.println("the policy holder of type "+m.getKey());
           for(int i=0;i<temp.size();i++)
               System.out.println(temp.get(i));
       }

    }

}
