package Collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.stream.Collectors;

public class method_ref_12_maptoDoble {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      
		Room cambridge =new Room("cambridge","Premire room",4,175.00);
	      Room rome= new Room("rome","Guest_Room",10,200.00 );
	      Room Bharat= new Room("Bharat","Cushing_Room",11,300.00 );
	      Room India = new Room("India", "Large_Room",12,280.00);
	      
	      Collection<Room>rooms= new ArrayList<>(Arrays.asList(rome,cambridge,Bharat,India));
		    rome.setPetFriendly(true);
		    India.setPetFriendly(true);
		    
		    Collection<Room>petFriendlyRooms= rooms.stream()
		         .filter(Room::isPetFriendly)
		         .collect(Collectors.toList());
		     
		   double total= petFriendlyRooms.stream()
				   .mapToDouble(Room::getRate)
				   .sum();
		        System.out.println(total);
	}
	
//Lambda expression has parameters, an arrow and a body.

//When working with a stream, to gather the elements flowing through the stream into a collection, we use collector.

}
//480.0