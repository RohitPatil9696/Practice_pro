
package Array_pro;
import java.util.*;
public class Find_Unique {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    
		int arr[]= {60,25,34,85,90,34,85,90};
		
		
		HashMap<Integer,Integer> hashmap = new HashMap<Integer,Integer>();   
        
        //use for loop to pull the elements of array to hashmap's key  
        for (int j = 0; j < arr.length; j++) {   
            hashmap.put(arr[j], j);   
        }   
        // use hashmap.keySet() for printing all keys of hashmap using it's keySet() method   
        System.out.println(hashmap.keySet());   

	}

}
