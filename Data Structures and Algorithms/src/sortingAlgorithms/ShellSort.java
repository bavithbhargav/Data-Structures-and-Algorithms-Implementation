package sortingAlgorithms;

public class ShellSort {
	
	private static int[] shellsort(int[] array) {
		 
		 int h = 1;
		 
		 while (h <= array.length / 3) {
			 h = 3 * h + 1; 
		 }
		 
		 while (h > 0) { 
			 for (int i = 0; i < array.length; i++) {
			 
				 int temp = array[i];
				 int j;
				 
				 for (j = i; j > h - 1 && array[j - h] >= temp; j = j - h) {
					 array[j] = array[j - h];
				 }
				 array[j] = temp;
			 }
		     h = (h - 1) / 3;
		 }
		 return array;
	 }
	
	 public static void main(String[] args) {
		 int[] array = { 1, 4, 3, 7, 10, 2, 9};
		 int[] result = shellsort(array);
		 for(int i=0; i<result.length; i++) {
			 System.out.print(result[i] + " ");
		 }
	 }

}
