package sortingAlgorithms;

public class SelectionSort {
	
public static void main(String[] args) {  
		
	    int[] a = {10, 9, 7, 101, 23, 44, 12, 78, 34, 23};
	    
	    int i,pos,temp;  
	    
	    for(i=0;i<10;i++)  
	    {  
	        pos = find_smallest(a,10,i);  
	        temp = a[i];  
	        a[i]=a[pos];  
	        a[pos] = temp;  
	    }  
	    
	    System.out.println("\nThe sorted array is");  
	    
	    for(i=0;i<10;i++)  
	    {  
	        System.out.print(a[i] + " ");  
	    }  
	}  
	
	public static int find_smallest(int a[], int n, int i)  
	{  
	    int small,pos,j;  
	    small = a[i];  
	    pos = i;  
	    for(j=i+1;j<10;j++)  
	    {  
	        if(a[j]<small)  
	        {  
	            small = a[j];  
	            pos=j;  
	        }  
	    }  
	    return pos;  
	}  

}
