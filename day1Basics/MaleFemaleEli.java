
// Write a program to take input age of male or Female and check he/she is eligible for marriage or not.
import java.util.Scanner;

public class MaleFemaleEli {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the you are (M/F)");
        String s = sc.next();
        char ch = s.charAt(0);
        System.out.println("Enter your age:");
        int age = sc.nextInt();
        if (ch == 'M' || ch == 'm') {
            if (age >= 21) {
                System.out.println("your are eligible for marriage");
            } else {
                System.out.println("You are not eligible");
            }

        } else if (ch == 'W' || ch == 'w') {
            if (age >= 18) {
                System.out.println("your are eligible for marriage");
            } else {
                System.out.println("You are not eligible");
            }

        } else {
            System.out.println("Invaild input !");

        }
    }

}
