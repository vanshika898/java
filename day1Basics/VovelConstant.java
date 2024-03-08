import java.util.Scanner;
// Check whether an alphabet is vowel or consonant using if..else statement

public class VovelConstant {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the character:");
        String ch = sc.next();
        char a = ch.charAt(0);
        if (a == 'A' || a == 'a' || a == 'e' || a == 'E' || a == 'i' || a == 'I' || a == 'o' || a == 'O' || a == 'u'
                || a == 'U') {
            System.out.println("number is vowel");
        } else {
            System.out.println("number is constant");
        }

    }
}
