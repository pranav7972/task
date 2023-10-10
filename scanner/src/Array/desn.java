package Array;
import java.util.Arrays;

public class desn {
 
	public static void main(String[] args) {
	
     int arr[]=new int[] {4,5,2,1,3};
        int temp=0;
         
         for (int i = 0; i < arr.length; i++) {     
             for (int j = i+1; j < arr.length; j++) {     
                if(arr[i] < arr[j]) {    
                    temp = arr[i];    
                    arr[i] = arr[j];    
                    arr[j] = temp;    
                }     
             }  
            System.out.println(arr[i]);
         }
	}
}
	

