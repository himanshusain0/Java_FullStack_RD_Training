import java.util.Scanner;

public class greatestAmong3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number ");
        int a = sc.nextInt();
        System.out.println("Enter a number ");
        int b = sc.nextInt();
        System.out.println("Enter a number ");
        int c = sc.nextInt();
        
        System.out.print(((a > b) && (a > c)) ? "a is greater" : " ");
        System.out.print(((b > a) && (b > c)) ? "b is greater" : " ");
        System.out.print(((c > a) && (c > b)) ? "c is greater" : " ");

        sc.close();
    }
}
