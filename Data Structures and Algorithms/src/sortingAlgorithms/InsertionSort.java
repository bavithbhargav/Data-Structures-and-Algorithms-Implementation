package sortingAlgorithms;

public class InsertionSort {
	
public static void main(String[] args) {  
		
	    int[] a = {10, 9, 7, 101, 23, 44, 12, 78, 34, 23};
	    
	    for(int i=1; i<10; i++)   
	    {  
	        int temp = a[i];  
	        int j= i-1;  
	        while(j>=0 && temp <= a[j])  
	        {  
	            a[j+1] = a[j];   
	            j = j-1;  
	        }  
	        a[j+1] = temp;  
	    }  
	    
	    System.out.println("The sorted array is");  
	    
	    for(int i=0; i<10; i++)  
	    {  
	        System.out.print(a[i] + " ");  
	    }  
	}  

}
