import java.util.Scanner;

public class power {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int n=sc.nextInt();
        System.out.println("Enter the power");
        int p=sc.nextInt();
        int pro=1;
        for(int i=1;i<=p;i++){
            pro=n*pro;
        }
        System.out.println(pro);
    }
    
}
