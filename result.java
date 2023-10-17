package Java;

import java.util.*;
public class result {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter student name");
        String name=sc.nextLine();

       // System.out.println(name);

        System.out.println("enter your subject");
        int subject=sc.nextInt();
       // System.out.println(subject);

        System.out.println("enter math marks");
        int math=sc.nextInt();
        System.out.println("enter hindi marks");
        int hindi=sc.nextInt();
        System.out.println("enter chemistry marks");
        int physics=sc.nextInt();
        System.out.println("enter chemistry marks");
        int chemistry=sc.nextInt();
        System.out.println("enter biology marks");
        int biology=sc.nextInt();
        float totalavg=(math+hindi+physics+chemistry+biology)/5;
        float marksper=((math+hindi+physics+chemistry+biology)*10)/50;

        System.out.println("totalavg"+totalavg);
        System.out.println("marksper"+marksper);

        
    }
    
}
