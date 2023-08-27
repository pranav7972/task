package Taskloop;

public class Multi4from1to120 {
	    
	public static void main(String[] args) {
	        int count = 0;
	        for (int num = 1; num <= 120; num++) {
	            if (num % 4 == 0) {
	                count++;
	            }
	        }
	        
	        System.out.println("Number of 4th multiplication Numbers = " + count);
	    }
	}

