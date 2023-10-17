import java.util.Scanner;

public class Tax  {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("enter your annual salary");
        double income = 35000;
        double tax=0;
        if (income <= 10000) {
            tax = 0;
        } else if (income <= 20000) {
            tax = income * 0.10;
        } else if (income <= 30000) {
            tax = income * 0.15;
        } else {
            tax = income * 0.25;
        }
        System.out.println("your tax is"+tax);
        sc.close();
}
}
