import java.util.*;
public class Question23{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter side1: ");
        int a = sc.nextInt();
        System.out.print("Enter side2: ");
        int b = sc.nextInt();
        System.out.print("Enter side3: ");
        int c = sc.nextInt();

        if(a==b && b==c){
            System.out.println("Equilateral");
        }else if(a==b || a==c || b==c){
            System.out.println("Isosceles");
        }else{
            System.out.println("Scalene");
        }
    }
}



import java.util.*;
public class Question23{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter side1: ");
        int a = sc.nextInt();
        System.out.print("Enter side2: ");
        int b = sc.nextInt();
        System.out.print("Enter side3: ");
        int c = sc.nextInt();
        if(a==b && b==c){
            System.out.print("Equilateral");
        }else if(a==b || b==c || a==c){
            System.out.print("Isosceles");
        }else{
            System.out.print("Scalene");
        }
    }
}


import java.util.*;
public class Question23{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter side1: ");
        int a = sc.nextInt();
        System.out.println("Enter side2: ");
        int b = sc.nextInt();
        System.out.print("Enter side3");
        int c = sc.nextInt();

        if(a==b && b==c){
            System.out.println("Equilateral");
        }else if(a==b || b==c || a==c){
            System.out.println("Isosceles");
        }else{
            System.out.println("Scalene")
        }
    }
}