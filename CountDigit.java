public class CountDigit {

    public static void main(String[] args){
        int n= 1234;
        int count =0;
        int temp= n;
        while (temp>0){
            count+=1;
            temp/=10;
        }
        System.out.println(count);
    }
}