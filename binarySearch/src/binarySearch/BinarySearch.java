/* 
 * BinarySearch.java
 * Shaun Hoadley
 * CPT-307 Data Structures and Algorithms
 * Professor Pete Limon
 * July 15, 2020 
 */

package binarySearch;
	
	// Binary search class
	public class BinarySearch {
		
		// Method to perform the search
		public static void binarySearch(int dataArray[], int firstArrayElement, int lastArrayElement, int key){  
		   
			// Find midpoint of the array
			int arrayMidpoint = (firstArrayElement + lastArrayElement)/2;  
			
			// Loop to find the data key
			while( firstArrayElement <= lastArrayElement ){  
				
				// Determine if key value is less than midpoint element value
				// Reset first array element to the right of the midpoint
				if ( dataArray[arrayMidpoint] < key ){  
					firstArrayElement = arrayMidpoint + 1;     
				}
				// Break loop if data key found, output to display
				else if ( dataArray[arrayMidpoint] == key ){  
					System.out.println("Your key, " + key + " is found at array index: " + arrayMidpoint);  
					break;  
				}
				// Reset last array element to the left of the midpoint
				else{  
					lastArrayElement = arrayMidpoint - 1;  
				}  
				// Determine new midpoint
				arrayMidpoint = (firstArrayElement + lastArrayElement)/2;  
			}  
				// Data key not found, output to display
				if ( firstArrayElement > lastArrayElement ){  
					System.out.println("Your key, " + key + " is not found!");  
				}  
		}  

		// Execute main method
		public static void main(String[] args) {
		 
			// Initialize array, data key, and last array index
			int dataArray[] = {5,10,15,20,25,30,35,40,45,50,55,60,65,70};
			int key = 0;  
			int last=dataArray.length-1;
	    
			// Set data key and search
			key = 17;  
			last=dataArray.length-1;  
			binarySearch(dataArray,0,last,key);
	    
			// Set data key and search
			key = 45;  
			last=dataArray.length-1;  
			binarySearch(dataArray,0,last,key);

		}

}
