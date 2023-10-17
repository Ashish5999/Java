import java.util.*;
public class bsm {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter your height");
        float height=sc.nextFloat();
        double mh=height*0.304;
        System.out.println("your height in meter is->"+mh);
        System.out.println("enter your weight");
        float weight=sc.nextFloat();
        double bmi=weight/(mh*mh);


        System.out.println("your bmi is ->"+bmi);
    }
    
}
