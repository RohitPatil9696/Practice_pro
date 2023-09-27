package Set_Interface;

import java.util.Arrays;
import java.util.List;
import java.util.NavigableSet;
import java.util.TreeSet;

public class lower_higher {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      
		 List<Integer>numbers= Arrays.asList(500,1500,2500,1000,3000,2000);

		  NavigableSet<Integer> numberTree= new TreeSet<>(numbers);
		  System.out.println(numberTree.higher(1500));
	}

}
//1000 .lower() method will give first lower number below that taken number
//2000 .higher() method will give first higher number above that taken number
//LinkedHashSet is a set implementation used to retain the order the elements were inserted into.
//
//Comparable interface can an object stored in a TreeSet implement to help define its order.
//
//Set does not allow duplicate values but does not maintain order unlike List.

