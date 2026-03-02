import java.util.*;

public class Question35{
    public static void main(String args[]) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a decimal number: ");
        int num = sc.nextInt();
        
        int binary = 0;
        int place = 1;   // 1, 10, 100, 1000...
        
        while(num > 0) {
            int rem = num % 2;      // remainder (0 or 1)
            binary = binary + (rem * place);
            place = place * 10;
            num = num / 2;
        }
        
        System.out.println("Binary number is: " + binary);
    }
}


import java.util.*;

public class Question35{
    public static void main(String args[]) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a decimal number: ");
        int num = sc.nextInt();
        
        int binary = 0;
        int place = 1;   // 1, 10, 100, 1000...
        
        while(num > 0) {
            int rem = num % 2;      // remainder (0 or 1)
            binary = binary + (rem * place);
            place = place * 10;
            num = num / 2;
        }
        
        System.out.println("Binary number is: " + binary);
    }
}



import java.util.*;

public class Question35{
    public static void main(String args[]) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a decimal number: ");
        int num = sc.nextInt();
        
        int binary = 0;
        int place = 1;   // 1, 10, 100, 1000...
        
        while(num > 0) {
            int rem = num % 2;      // remainder (0 or 1)
            binary = binary + (rem * place);
            place = place * 10;
            num = num / 2;
        }
        
        System.out.println("Binary number is: " + binary);
    }
}