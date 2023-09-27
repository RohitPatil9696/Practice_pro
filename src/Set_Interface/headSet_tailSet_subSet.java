package Set_Interface;

import java.util.Arrays;
import java.util.List;
import java.util.NavigableSet;
import java.util.TreeSet;

public class headSet_tailSet_subSet {

	public static void main(String[] args) {
		
  
		List<Integer> numbers = Arrays.asList(500,1500,2500,1000,3000,2000);
		NavigableSet<Integer>numberTree = new TreeSet<>(numbers);
		numberTree.subSet(1500,3000)
		             .stream()
		             .forEach(System.out::println);
		
	}

}
/*
 *1).headSet(1500) means that number excluded and find below that number
 500
1000
 
 2).tailSat(1500) means that number included and find all above number 
 1500
2000
2500
3000

3).subSet(1500,3000) means starting from number consider if present in it
 and between number from that two number and last number neglect if also present in it

1500
2000
2500


*/