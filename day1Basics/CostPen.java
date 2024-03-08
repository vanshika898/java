
// Write a java program to input a cost of a pen and calculate 70 pens cost with some discount. if total pen cost greater than 1000 then we calculate 20% discount otherwise 10%.
import java.util.Scanner;

public class CostPen {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("eneter the cost of single pen :");
        int Cost = sc.nextInt();
        int price = 70 * Cost;
        double discount, total;
        if (price >= 1000) {

            discount = price * 0.2;
            total = price - discount;
            System.out.printf("total cost of 20 pen after discount is %f  and discount on pen is %f  rupees", total,
                    discount);

        } else {
            discount = price * 0.04;
            total = price - discount;
            System.out.printf("total cost of 20 pen is after discount %f  and discount on pen is %f rupees ", total,
                    discount);

        }
    }
}