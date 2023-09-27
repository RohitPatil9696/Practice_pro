package Collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

public class Foreach_2_Loop_Room_collection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Room cambridge =new Room("cambridge","Premire room",4,175.00);
      Room rome= new Room("rome","Guest_Room",10,200.00 );
      Room Bharat= new Room("Bharat","Cushing_Room",11,300.00 );
      
      Collection<Room>rooms= new ArrayList<>(Arrays.asList(cambridge,rome,Bharat));
      for(Room room :rooms)
      {
    	  System.out.println(room.getName());
      }
	}

	
	//cambridge
	//rome
	//Bharat

}
