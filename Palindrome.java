import java.util.Scanner;

class Palindrome{

    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the number=");
        int n=s.nextInt();
        int temp=n;
        int r=0;
        while(n!=0){
            r=r*10+n%10;
            n/=10;
        }
        if(temp==r){
            System.out.println("It is Palindrome");
        }
        else{
            System.out.println("It is not Palindrome");
        }

    }

}
