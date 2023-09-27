package Set_Interface;

import java.util.Arrays;
import java.util.List;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.TreeSet;

public class Set_TreeSeet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      
		List<Integer> numbers = Arrays.asList(500,1500,2500,1000,3000,2000);
		NavigableSet<Integer>numberTree = new TreeSet<>(numbers);
		numberTree.stream()
		//numberTree.descendingSet().stream()
		             .forEach(System.out::println);
		
	}

}

/*
 500
1000
1500
2000
2500
3000

//For descending, use, numberTree.descendingSet().stream().
 *//*
 *3000
2500
2000
1500
1000
500
 */