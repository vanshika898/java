import java.util.Scanner;

// Write a java program to Take values of length and breadth of a rectangle from user and check if it is square or not.
public class CheckSquare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter  the length:");
        int length = sc.nextInt();
        System.out.print("enter  the breadth:");
        int breadth = sc.nextInt();
        if (length == breadth) {
            System.out.println("It is the Square");
        } else {
            System.out.println("It is  not  the Square");
        }
    }
}
