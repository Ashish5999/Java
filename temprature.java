
import java.util.*;
public class temprature {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter celsius temp");
        float cel=sc.nextFloat();
        float fahrenheit=cel*9/5+32;
        System.out.println("celsius temp is"+cel);
        System.out.println("fahrerheit"+fahrenheit);
    }
}
