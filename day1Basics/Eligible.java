import java.util.Scanner;

public class Eligible {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your  :");
        int age = sc.nextInt();
        if (age < 18) {
            System.out.println("You are not eligible");
        } else {
            System.out.println("You are  eligible");
        }

    }
}
