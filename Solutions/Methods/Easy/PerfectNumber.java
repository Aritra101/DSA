import java.util.*;
public class PerfectNumber
 {
   public static void main (String[]args)
   {
     Scanner sc = new Scanner(System.in);
     System.out.print("Enter a number::");
     int num = sc.nextInt();
     if (perfect(num))
        System.out.printf("%d is a perfect number",num);
     else
        System.out.printf("%d is not a perfect number",num);


   }
   public static boolean perfect(int n){
       int sum=0,i;
       boolean flag=false;
       for(i=1;i<n;i++){
            if(n%i==0)
                sum += i;
           }
       if(sum==n)
        flag=true;
       else
        flag=false;
    return flag;
       
 }
 }