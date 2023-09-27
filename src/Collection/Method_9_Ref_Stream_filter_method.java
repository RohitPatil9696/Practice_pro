package Collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

public class Method_9_Ref_Stream_filter_method {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
		 Room cambridge =new Room("cambridge","Premire room",4,175.00);
	      Room rome= new Room("rome","Guest_Room",10,200.00 );
	      Room Bharat= new Room("Bharat","Cushing_Room",11,300.00 );
	      Room India = new Room("India", "Large_Room",12,280.00);
	      
	      Collection<Room>rooms= new ArrayList<>(Arrays.asList(rome,cambridge,Bharat,India));
		    rome.setPetFriendly(true);
		    India.setPetFriendly(true);
		    rooms.stream()
		    .filter(Room::isPetFriendly)
		    .forEach(room -> System.out.println(room.getName()));
		
	}

}
/*
 
 rome
 India
*/
