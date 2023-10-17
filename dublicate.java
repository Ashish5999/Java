import java.util.*;
public class dublicate {
    public static void main(String[] args) {
        int[]arr={1,5,3,4,2,5};
        int i=0;
        int j=0;
        for(i=0;i<6;i++){
            for(j=i+1;j<6;j++){
                if(arr[j]==arr[i]){
                    arr[j]=99;
                }
            }
        }
        for(i=0;i<6;i++){
            System.out.println(arr[i]+" ");
        }

    }
    
}
