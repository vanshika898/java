import java.util.Scanner;

public class FindMax {
    public static void main(String[] gg) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter first number:");
        int n1 = sc.nextInt();
        System.out.print("enter second number:");
        int n2 = sc.nextInt();
        if (n1 > n2) {
            System.out.println("a is larger!");
        } else if (n1 < n2) {
            System.out.println("b is larger !");
        }

        else {
            System.out.println("both are equal !");
        }

    }
}