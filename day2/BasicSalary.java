// Write a java program to take Basic salary of employee from user and calculate gross salary with given condition, if Basic salary >= 10000 then we calculate 40% da and 30% ta of Basic salary otherwise 30% da and 20% ta of Basic salary.

import java.util.Scanner;

public class BasicSalary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the basic salary:");
        double BasicSalary = sc.nextInt();
        double da, ta;
        if (BasicSalary >= 10000) {
            da = BasicSalary * 0.4;
            ta = BasicSalary * 0.3;

        } else {
            da = BasicSalary * 0.3;
            ta = BasicSalary * 0.2;
        }
        System.out.printf("da is  %f and ta %f .", da, ta);
    }

}
