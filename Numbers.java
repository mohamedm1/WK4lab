
public class Numbers {

	
	public static void nextLargest(int array[]) {
	  
	
	int max;
	  
	
	for(int i=0; i<array.length; i++) {
	  
	
	max = Integer.MAX_VALUE;
	  
	
	for(int j=0; j<array.length; j++) {
	  
	if(array[j]>array[i] && array[j]<max) {
	max = array[j];
	}
	}
	  
	
	System.out.print(array[i] + ": " + max + " ");
	}
	}
	  
	   public static void main(String[] args) {
	  
	   
		   int array[] = {78, 
				   22, 56, 99, 12, 14, 17, 15, 1, 144, 37, 23, 47, 88, 3, 19};
	   nextLargest(array);
	   }
	}
