import java.util.Scanner;

public class Primeno {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = s.nextInt();
        int c=0;
        for (int i = 2; i < num ; i++) {
            if (num %i == 0) {
                c+=1;
            }else{
                c=0;

            }
        }
        if(c==0){
            System.out.println("NUMBER IS A PRIME NUMBER");

        }
        else
            System.out.println("NUMBER IS NOT A PRIME NUMBER");
    }
}
