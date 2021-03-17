package StringProg;

import java.util.HashSet;

public class AAA {

	 int reap(int arr[],int n) {
		 
	
		 // Initialize index of first repeating element 
        int min = -1; 
  
        // Creates an empty hashset 
        HashSet<Integer> set = new HashSet<>(); 
  
        // Traverse the input array from right to left 
        for (int i=0; i<=arr.length; i++) 
        { 
            // If element is already in hash set, update min 
            if (set.contains(arr[i])) 
                min = i; 
  
            else   // Else add element to hash set 
                set.add(arr[i]); 
        } 
  
        // Print the result 
        if (min != -1) 
          return arr[min]; 
        else
          return min;
    } 
		
	public static void main(String[] args) {
		 int arr[] = {10, 5, 3, 4, 3, 5, 6}; 
		 int l=arr.length;
		  AAA r=new AAA();
		 
	      System.out.println(r.reap(arr,l));
	        

	}

}
