import java.util.*; 
 
public class Question30{ 
   public static void main(String[] args) { 
       Scanner sc = new Scanner(System.in); 
 
       System.out.print("Enter coefficient a: "); 
       double a = sc.nextDouble(); 
       System.out.print("Enter coefficient b: "); 
       double b = sc.nextDouble(); 
       System.out.print("Enter coefficient c: "); 
       double c = sc.nextDouble(); 
 
       double d = b*b - 4*a*c; 
 
       if(d > 0) 
Soumik Karmakar - Object Oriented Programming with Java 
System.out.println("Two Real and Distinct Roots"); 
else if(d == 0) 
System.out.println("Two Real and Equal Roots"); 
else 
System.out.println("Complex Roots"); 
} 
} 



import java.util.*;
public class Question30{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Coefficient a: ");
        double a = sc.nextDouble();
        System.out.print("Enter Cofficient b: ");
        double b = sc.nextDouble();
        System.out.print("Enter Cofficient c: ");
        double c = sc.nextDouble();

        double d = (b*b) - (4*a*c);

        if(d>0){
            System.out.println("Two Real and Distinct Roots");
        }else if(d==0){
            System.out.println("Two Real and Equal Roots");
        }else{
            System.out.println("Complex Roots");
        }
    }
}



import java.util.*;
public class Question30{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Coefficient a: ");
        double a = sc.nextDouble();
        System.out.print("Enter Cofficient b: ");
        double b = sc.nextDouble();
        System.out.print("Enter Cofficient c: ");
        double c = sc.nextDouble();

        double d = (b*b) - (4*a*c);

        if(d>0){
            System.out.println("Two Real and Distinct Roots");
        }else if(d==0){
            System.out.println("Two Real and Equal Roots");
        }else{
            System.out.println("Complex Roots");
        }
    }
}