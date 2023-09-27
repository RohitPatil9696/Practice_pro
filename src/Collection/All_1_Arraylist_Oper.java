package Collection;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
public class All_1_Arraylist_Oper {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      
	    //COLLECTION AS STRING TAKE IT AND OTHER HAND USE ARRAYLIST
		
		Collection<String>c= new ArrayList<>();
		
	//1)INSERT(boolean ie true or false)//For adding String in collection
		 c.add("Jay");
		 c.add("Siya");
		 c.add("Ram");
      //Bulk_INSERT  // For adding at time all string
		 c.addAll(List.of("Sita","Ram1"));
		 System.out.println(c);
		 
		// [Jay, Siya, Ram, Sita, Ram1]
		 
   //2) REMOVE(boolean)
		 c.remove("Ram1");
		 c.remove("Hanuman");
		 System.out.println(c);
		 
		 //[Jay, Siya, Ram, Sita]
		 
	  //Bulk_REMOVEALL //For removing at time all string	 
		 c.removeAll(List.of("Jay","Hanuman"));
		 System.out.println(c);
		 
		 //[Siya, Ram, Sita]
		

	  //Bulk_clear(void)
		 c.clear();
		 System.out.println(c);
		 
		 // []
		 
		 c.addAll(List.of("Jay","Siya","Ram","Ram1"));
		 System.out.println(c);
		 
		 //[Jay, Siya, Ram, Ram1]
		
	  //Bulk_RETAINALL(boolean)
		 //retainAll(List.of() means inner ele keep n other delete
		 c.retainAll(List.of("Siya","Ram1"));
		 System.out.println(c);
		 
		 // [Siya, Ram1]
		
		 
	//3)CONTAINS(boolean)(it check were element is present or not)
		boolean m = c.contains("Siya");
		 System.out.println(m);
		 
		 // true
		
		 boolean y = c.contains("Jay");
		 System.out.println(y);
		 
		 // false
		
	  // Bulk_ContainsAll if it include all ele then  result will true although false)
		boolean n= c.containsAll(List.of("jay"));
		System.out.println(n);
		
		// false
		
		 
	// 4)Empty_colle_check isEmpty()(boolean)
		 boolean o =c.isEmpty();
		 System.out.println(o);
		 
		 // false
		 
    //5) Size() (int) (check size of collection)
		int p=c.size();
		System.out.println(p);
	
		//2
		

						
	// Here we  Used different Class that is HashSet
		Collection<String>d= new HashSet<>();
		d.add("Raj");
		d.add("Ranvir");
		d.addAll(List.of("Rajesh","Sita","Raj"));
		System.out.println(d);
		
		//[Sita, Ranvir, Rajesh, Raj]
		
		
		
	//Same collection type different element type
		
		Collection e= new ArrayList();
		e.add("Bharat");
		e.add(11);
		
		System.out.println(e); 
		
		//class java.lang.String
		//class java.lang.Integer
		
		e.stream() 
		      .forEach(s->System.out.println(s.getClass()));
		// when we done e.stream() then we get
		System.out.println(e);
		
		
		//[Bharat, 11]

		
		 
	}

}
