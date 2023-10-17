import java.util.*;
class Zero{
        public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n=sc.nextInt();
        int count=0;
        while(n!=0){
        int r=n%10;
        if(r==0){
        count=count+1;
        } 
        n=n/10;   
        }
        System.out.println("No. of zeros are :");
        System.out.println(count);
    }
}

