package WArray;
import java.util.Arrays;

public class A {

	public static void main(String[] args) {
		
		
        int arr[]=new int [6];
        
        arr[0]=2;
        arr[1]=5;
        arr[2]=20;
        arr[3]=10;
        arr[4]=9;
        arr[5]=8;
        
        Arrays.sort(arr);
    
        A a=new A();
        int Arry[]=a.SwapArray(arr);
        for (int i : Arry) {
			System.out.println(i);
		}
        
	}
	
    public int[] SwapArray(int Array[])
    {
    	int temp = 0; 
    	for (int i=0;i<Array.length;)
    	{
    	   temp = Array[i];
    	   Array[i]=Array[i+1];
    	   Array[i+1]=temp;
    	   i=i+2;
    	   
    	}
    	return Array;
    }
}