import java.util.*;
public class BinarySearch
{
    public static void binarysearch(int[] arr,int t)
    {
        int l=0;
        int r=arr.length-1;
        while(l<=r)
        {
            int mid=(l+r)/2;
            if(arr[mid]<t)
            {
                l=mid+1;
            }
            else if(arr[mid]>t) r=mid-1;
            else {
                System.out.println("index of the target is :"+mid);
                return;
            }
        }
        System.out.println("target is not present");
    }
    public static void searchRange(int[] nums, int target) {
        int indx1=-1;
        int indx2=-1;
        int si1=0,si2=0,ei1=nums.length-1,ei2=nums.length-1;
        int mid1=0,mid2=0;
        while( si1<=ei1||si2<=ei2 ){
            mid1=(si1+ei1)/2;
            mid2=(si2+ei2)/2;
            if(nums[mid1]<target){
                si1=mid1+1;
            }
            if(nums[mid2]<target){
                si2=mid2+1;
            }
            if(nums[mid1]>target){
                ei1=mid1-1;
            }
            if(nums[mid2]>target){
                ei2=mid2-1;
            }
            if(nums[mid1]==target){
                indx1=mid1;
                si1=0;
                ei1=mid1-1;
            }
            if(nums[mid2]==target){
                indx2=mid2;
                si2=mid2+1;
                ei2=nums.length-1;
            }

        }
         System.out.println("first and last occurence of the target is :" +indx1+"and "+indx2);
    }
    public static void findminmax(int[] arr,int t)
    {
        int l=0;
        int r=arr.length-1;
        int min=-1;
        int max=-1;
        while(l<=r)
        {
            int mid=(l+r)/2;
            if(arr[mid]<t)
            {
                min=arr[mid];
                l=mid+1;
            }
            else if(arr[mid]>t){
                max=arr[mid];
                r=mid-1;
            }
            else {
                System.out.println("the min and max value are :"+mid+" "+mid);
                return ;
            }
        }
        System.out.println("the min and max value are :"+min+" "+max);
    }
    public static void  search(int[] arr, int target)
    {
        int low=0;
        int high=arr.length-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(arr[mid]<arr[low])
            {
                if(arr[mid]<=target&&target<=arr[high]) low=mid;
                else high=mid-1;
            }
            else if(arr[mid]>arr[high]){
                if(arr[low]<=target&&target<=arr[mid]) high=mid;
                else low=mid+1;
            }
            else
            {
                if(arr[mid]<target) low=mid+1;
                else if(arr[mid]>target) high=mid-1;
                else
                {
                    System.out.println("the index is :"+mid);
                    return;
                }
            }

        }
        System.out.println("target is not present");

    }
    public static void  mySqrt(int x)
    {
        long l=1;
        long r=x;
        long res=0;
        while(l<=r)
        {
            long mid=(l+r)/2;
            long k=mid;
            long ans=k*k;
            if(ans<=x)
            {
                res=mid;
                l=mid+1;
            }
            else
            {
                r=mid-1;
            }
        }
         System.out.println("the square root of the number is :"+(int)(res));
    }
    public static int findPeakElement(int[] arr) {
        int low=0;
        int high=arr.length-1;
        int mid=(low+high)/2;
        if(arr.length==1) return 0;
        while(low<=high)
        {
            if(mid==0)
            {
                if(arr[mid]>arr[mid+1]) return mid;
                low = mid + 1;
            }
            else if(mid==arr.length-1) {
                if(arr[mid]>arr[mid-1]) return mid;
                high=mid-1;
            }
            else if(mid>0&&mid<arr.length-1){
                if(arr[mid]>arr[mid-1]&&arr[mid]>arr[mid+1]) return mid;
                else if(arr[mid]>arr[mid-1]) low=mid+1;
                else high=mid-1;
            }
            mid=(low+high)/2;
        }
        if(arr[0]>arr[arr.length-1]) return 0;
        else return arr.length-1;
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of the array");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("enter the sorted array");
        for(int i=0;i<n;i++) arr[i]=sc.nextInt();
        System.out.println("enter the target :");
        int t=sc.nextInt();
        binarysearch(arr,t);
        searchRange(arr,t);
        System.out.println("enter the value :");
        int t1=sc.nextInt();
        findminmax(arr,t1);
        System.out.println("enter the size of rotated array:");
        int n1=sc.nextInt();
        System.out.println("enter the sorted rotated  array");
        int[] arr1=new int[n1];
        for(int i=0;i<n;i++) arr1[i]=sc.nextInt();
        System.out.println("enter the target :");
        int t2=sc.nextInt();
        search(arr1,t2);
        System.out.println("enter the size of bitonic array :");
        int n3=sc.nextInt();
        int[] b=new int[n3];
        System.out.println("enter the elements :");
        for(int i=0;i<n3;i++) b[i]=sc.nextInt();
        System.out.println("the index of peak elements is "+ findPeakElement(b));
        System.out.println("enter the number to find it's square root :");
        int x=sc.nextInt();
        mySqrt(x);

    }
}
