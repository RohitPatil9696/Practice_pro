package Collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

public class Iterator_3_loop_Room_Collection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
	      Room cambridge =new Room("cambridge","Premire room",4,175.00);
	      Room rome= new Room("rome","Guest_Room",10,200.00 );
	      Room Bharat= new Room("Bharat","Cushing_Room",11,300.00 );
	      Collection<Room>rooms= new ArrayList<>(Arrays.asList(rome,cambridge,Bharat));
	    
	      Iterator<Room> iterator= rooms.iterator();
	      
	    	  System.out.println(iterator.next().getName());
	    	  System.out.println(iterator.next().getName());
	    	  System.out.println(iterator.next().getName());
	      
		/*
		 * rome
           cambridge
           Bharat
		 */
	}

}
