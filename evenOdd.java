import java.util.Scanner;

public class evenOdd {

    public static void main(String[] args) {
         Scanner sc =new Scanner(System.in);
         System.out.println("Enter a number ");
         int a = sc.nextInt();
        System.out.println((a%2==0)?"Even ":"Odd ");
        sc.close();
        
    }
    
}
