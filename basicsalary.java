import java.util.*;
public class basicsalary {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter basic salary");
        int bs=sc.nextInt();
        
        int pf=1500;
        float hra=(bs*30)/100;
        float ta=(bs*20)/100;
        float da=(bs*10)/100;
        System.out.println("hra"+bs*0.3);
        System.out.println("ta"+bs*0.2);
        System.out.println("da"+bs*0.1);
        float salary=bs+hra+da+ta+pf;
        System.out.println(salary);

    }
    
}
