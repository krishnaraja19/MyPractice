import java.util.Arrays;
import java.util.Scanner;

public class DistributeEvenly {
	public static void getMinDifference(int[] arr) {
	    if(arr.length != 0) {
	    	 int sumOfArray = 0;
	    	 sumOfArray = Arrays.stream(arr).sum();
	 	    
	 	    int sum = sumOfArray / 2;
	 	    
	 	    boolean[][] mat = new boolean[arr.length][sum + 1];
	 	    
	 	    for(int i = 0; i < arr.length; i++) {
	 	      mat[i][0] = true;
	 	    }
	 	    
	 	    for(int j = 0; j <= sum; j++) {
	 	      if(j == arr[0]) {
	 	        mat[0][j] = true;
	 	      }
	 	    }
	 	    
	 	    for(int i = 1; i < arr.length; i++) {
	 	      for(int j = 1; j <= sum; j++) {
	 	        
	 	        if(mat[i - 1][j]) {
	 	          mat[i][j] = true;
	 	        } else {
	 	          if(j >= arr[i]) {
	 	            mat[i][j] = mat[i - 1][j - arr[i]];  
	 	          }
	 	        }
	 	      }
	 	    }
	 	    
	 	    int lastRow = arr.length - 1;
	 	    int firstPart = -1;
	 	    
	 	    for(int j = sum; j >= 0; j--) {
	 	      if(mat[lastRow][j]) {
	 	    	 firstPart = j;
	 	        break;
	 	      }
	 	    }
	 	    
	 	    int secondPart = sumOfArray - firstPart;
	 	    
	 	    System.out.println(secondPart +" "+firstPart );
	    }
	    
	   
	    
	  }
	  
	  public static void main(String[] args) {

	  
	   
	    Scanner scanner = new Scanner(System.in);
	    
	    int size;
	    int element;
	    
	    while ((size = scanner.nextInt()) != 0) {
	    	 int[] arr = new int[size];
	 	    
	 	    for (int j = 0; j < size; j++) {
	 	        
	 	        element = scanner.nextInt();
	 	        arr[j]= element;
	 	    }
	 	    
	 	    
	 	    DistributeEvenly.getMinDifference(arr);
	    }
	    
	   
	    
	   
	    
	  }
}
