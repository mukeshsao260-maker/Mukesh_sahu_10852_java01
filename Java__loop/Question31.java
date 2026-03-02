import java.util.*;
public class Question31{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
          int n;
    int count = 0;
    int sum = 0;
    int pow = 1;
    System.out.print("Enter a number: ");
     n = sc.nextInt();
    int temp1 = n;
    while(temp1>0){
        temp1 = temp1/10;
        count++;
    }
    int temp2 = n;
    while(temp2>0){
        int rem = temp2%10;
        for(int i=1;i<=count;i++){
            pow = pow*rem;
        }
        sum = sum+pow;
        temp2 = temp2/10;
        pow = 1;
    }
    if(sum == n){
        System.out.println("Armstrong Number.");
    }else{
        System.out.println("Not a Armstrong number.");
    }
    }
}




import java.util.*;
public class Question31{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
          int n;
    int count = 0;
    int sum = 0;
    int pow = 1;
    System.out.print("Enter a number: ");
     n = sc.nextInt();
    int temp1 = n;
    while(temp1>0){
        temp1 = temp1/10;
        count++;
    }
    int temp2 = n;
    while(temp2>0){
        int rem = temp2%10;
        for(int i=1;i<=count;i++){
            pow = pow*rem;
        }
        sum = sum+pow;
        temp2 = temp2/10;
        pow = 1;
    }
    if(sum == n){
        System.out.println("Armstrong Number.");
    }else{
        System.out.println("Not a Armstrong number.");
    }
    }
}




import java.util.*;
public class Question31{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
          int n;
    int count = 0;
    int sum = 0;
    int pow = 1;
    System.out.print("Enter a number: ");
     n = sc.nextInt();
    int temp1 = n;
    while(temp1>0){
        temp1 = temp1/10;
        count++;
    }
    int temp2 = n;
    while(temp2>0){
        int rem = temp2%10;
        for(int i=1;i<=count;i++){
            pow = pow*rem;
        }
        sum = sum+pow;
        temp2 = temp2/10;
        pow = 1;
    }
    if(sum == n){
        System.out.println("Armstrong Number.");
    }else{
        System.out.println("Not a Armstrong number.");
    }
    }
}