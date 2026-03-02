import java.util.*;
public class Question32{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number: ");
        int n = sc.nextInt();
        int sum = 0;
        int fact = 1;
        int temp = n;
        while(temp>0){
            int rem = temp%10;
            for(int i=1;i<=rem;i++){
                fact = fact*i;
            }
            sum = sum+fact;
            fact = 1;
            temp = temp/10;
        }
      
       if(sum == n) 
           System.out.println("Strong Number"); 
       else 
           System.out.println("Not Strong Number"); 
    }
}



import java.util.*;
public class Question32{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number: ");
        int n = sc.nextInt();
        int sum = 0;
        int fact = 1;
        int temp = n;
        while(temp>0){
            int rem = temp%10;
            for(int i=1;i<=rem;i++){
                fact = fact*i;
            }
            sum = sum+fact;
            fact = 1;
            temp = temp/10;
        }
      
       if(sum == n) 
           System.out.println("Strong Number"); 
       else 
           System.out.println("Not Strong Number"); 
    }
}




import java.util.*;
public class Question32{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number: ");
        int n = sc.nextInt();
        int sum = 0;
        int fact = 1;
        int temp = n;
        while(temp>0){
            int rem = temp%10;
            for(int i=1;i<=rem;i++){
                fact = fact*i;
            }
            sum = sum+fact;
            fact = 1;
            temp = temp/10;
        }
      
       if(sum == n) 
           System.out.println("Strong Number"); 
       else 
           System.out.println("Not Strong Number"); 
    }
}