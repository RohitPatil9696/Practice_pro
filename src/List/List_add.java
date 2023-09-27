package List;

import java.util.ArrayList;
import java.util.List;

public class List_add {

	public static void main(String[] args) {
		// by default what is the size of arraylist: 10
      List<String> c= new ArrayList<>();
      //Insert
      c.add("A");
      c.add("A");
      System.out.println(c);
      //=>[A, A]
     
      
      //Insert by position
      c.add(1,"B");
      System.out.println(c);
      //=> [A, B, A]
      
      //Bulk Insert by Position return element
      c.addAll(2,List.of("C","D","E"));
      System.out.println(c);
      //=>[A, B, C, D, E, A]
      
      //Replace By Position return element
      String M= c.set(5,"F");
       System.out.println(M);
        //     [A]
      //=> [A, B, C, D, E, F]
      
       
       //Retrive elements position return int
      int n= c.indexOf("C");
       System.out.println(n);
       //=>2
       
       
       //Remove by Position 
       String m= c.remove(5);
       System.out.println(m);
       
       //=>F
	}

}
