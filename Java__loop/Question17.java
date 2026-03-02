public class Question17{ 
   public static void main(String[] args) { 
       int n1 = 20, n2 = 30; 
       int gcd = 1; 
 
       for(int i=1;i<=n1 && i<=n2;i++) { 
           if(n1%i==0 && n2%i==0) { 
               gcd = i; 
           } 
       } 
       System.out.println("GCD: " + gcd); 
   } 
} 




import java.util.*;
public class Question17{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first Number: ");
        int a = sc.nextInt();
        System.out.print("Enter second Number: ");
        int b = sc.nextInt();
        int gcd;

        for(int i=1;i<=a && i<=b;i++){
            if(a%i==0 && b%i==0){
                gcd = i;
            }
            System.out.print("GCD: "+ gcd);
        }
    }
}


import java.util.*;
public class Question17{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first Number: ");
        int a = sc.nextInt();
        System.out.print("Enter second Number: ");
        int b = sc.nextInt();
        int gcd;

        for(int i=1;i<=a && i<=b;i++){
            if(a%i==0 && b%i==0){
                gcd = i;
            }
            System.out.print("GCD: "+ gcd);
        }
    }
}