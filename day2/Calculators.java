import java.util.Scanner;

public class Calculators {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a:");
        int a = sc.nextInt();
        System.out.print("enter b:");
        int b = sc.nextInt();
        System.out.print("enter operator:");
        char ch = sc.next().charAt(0);
        switch (ch) {
            case '+':
                System.out.println(a + b);
                break;

            case '-':
                System.out.println(a - b);
                break;
            case '*':
                System.out.println(a * b);
                break;
            case '/':
                System.out.println(a / b);
                break;

            default:
                break;
        }

    }
}
