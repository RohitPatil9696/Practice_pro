package Collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

public class Stream6_Iterator_Collection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      
		 Room cambridge =new Room("cambridge","Premire room",4,175.00);
	      Room rome= new Room("rome","Guest_Room",10,200.00 );
	      Room Bharat= new Room("Bharat","Cushing_Room",11,300.00 );
	      Room India = new Room("India", "Large_Room",12,280.00);
	      Collection<Room>rooms= new ArrayList<>(Arrays.asList(rome,cambridge,Bharat,India));
	      rome.setPetFriendly(true);
	      cambridge.setPetFriendly(true);
	      
	      Iterator<Room>iterator = rooms.iterator();
	      while(iterator.hasNext()) {
	    	  Room room = iterator.next();
	    	  
	    	  if(room.isPetFriendly()) {
	    		  iterator.remove();
	    		  
	    	  }
	      }
	      
	      rooms.stream()
	      .forEach(r -> System.out.println(r.getName()));
	}
     //Iterator allows to modify collection while iterating.
	/*
	 *
       Bharat
       India

	 */
}
