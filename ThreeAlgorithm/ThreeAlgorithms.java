package ThreeAlgorithm;

public class ThreeAlgorithms {
	
	/**
	 * Swaps the elements at indexes i and j 
	 */
	public static void swapElements(int[] array,int i,int j) {
		int temp = array[i];
		array[i] = array[j];
		array[j] = temp;
		
	}
	/**
	 * Finds the index of the lowest value
	 * starting from the index at start (inclusive)
	 * and going to the end of the array.
	 */
	public static int indexLowest(int[] array, int start) {
		int lowIndex = start;
		for (int i = start; i < array.length; i++) {
			if (array[i] < array[lowIndex]) {
				lowIndex = i;
			}
		}
		return lowIndex;
	}

	/**
	 *  Sorts the elements (in place) using selection sort.
	 */
	public static void selectionSort(int[] array) {
		for (int i = 0; i < array.length; i++) {
			int j = indexLowest(array,i);
			swapElements(array, i, j);

}
	}

	public static void bubbleSort(int[] array) {
		int n = array.length;
		int temp = 0;
		for (int i = 0 ; i < n; i++) {
			for (int j = 1; j < (n-i); j++) {
				if(array[j-1] > array[j]) {
					temp = array[j-1];
					array[j-1] = array[j];
					array[j] = temp;
					
					
				}
				
			}
			
		}
}
	 public static void insertionSort(int[] arr) 
	    { 
	        int n = arr.length; 
	        for (int i=1; i<n; ++i) 
	        { 
	            int key = arr[i]; 
	            int j = i-1; 
	  
	            /* Move elements of array[0..i-1], that are 
	               greater than key, to one position ahead 
	               of their current position */
	            while (j>=0 && arr[j] > key) 
	            { 
	                arr[j+1] = arr[j]; 
	                j = j-1; 
	            } 
	            arr[j+1] = key; 
	        } 
	    } 
	 public static void main(String[] args) {
		 long startTime = System.nanoTime();
	    int arr[] ={3,60,35,2,45,320,5};  
	     
	    System.out.println("Array Before Sortings");  
	    for(int i=0; i < arr.length; i++){  
	            System.out.print(arr[i] + " ");  
	    }  
	    System.out.println();  
	      
	    selectionSort(arr);//sorting array elements using bubble sort  
	     
	    System.out.println("Array After Selection Sort");  
	    for(int i=0; i < arr.length; i++){  
	            System.out.print(arr[i] + " ");  
	    } 
	    System.out.println();
	   
	  //code
	  long endTime = System.nanoTime();
	  long startTime1 = System.nanoTime();
	    bubbleSort(arr);//sorting array elements using bubble sort  
	     System.out.println("Array After Bubble Sort");  
	    for(int i=0; i < arr.length; i++){  
	            System.out.print(arr[i] + " ");  
	    } 
	    System.out.println();
	  long endTime1 = System.nanoTime();
	  long startTime2 = System.nanoTime();   
  	insertionSort(arr); 
  	System.out.println("Array After Insertion Sort");
    int n = arr.length; 
      for (int i=0; i<n; ++i) {
          System.out.print(arr[i] + " "); 
      }
      System.out.println();
	  long endTime2 = System.nanoTime();
	  double sum = 0;
      for (int i = 0; i < 10; i++) {
    	  sum = sum + (endTime-startTime);
		
	}
      System.out.println("Average in 10 times of Selection Sort = " + (sum/10+sum%10) + " ns"  );
      double sum1 = 0;
      for (int i = 0; i < 10; i++) {
    	  sum1 = sum1 + (endTime1-startTime1);
		
	}
      System.out.println("Average in 10 times of Bubble Sort = " + (sum1/10+sum1%10) + " ns"  );
      double sum2 = 0;
      for (int i = 0; i < 10; i++) {
    	  sum2 = sum2 + (endTime2-startTime2);
		
	}
      System.out.println("Average in 10 times of Insertion Sort = " + (sum2/10+sum2%10) + " ns"  );





	}
}