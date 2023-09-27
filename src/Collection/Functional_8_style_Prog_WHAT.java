package Collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class Functional_8_style_Prog_WHAT {

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
		          .filter(new Predicate <Room>() {
		        	  
		        	  public boolean test(Room room) {
		        		  System.out.format("Testing %s with result %b%n", room.getName(),room.isPetFriendly());
		        		   return room.isPetFriendly();
		        		   // Here we used %s for String
		        		   // %b for boolean
		        		   // %n for new line
		        		   
		        	  }
		        	  }).forEach( new Consumer<Room>() {
		        		  public void accept(Room room) {
		        			  System.out.println(room.getName());
		        		  }
		        	  });
		          }
	}

/*
 
  Testing rome with result true
  rome
  Testing cambridge with result false
  Testing Bharat with result false
  Testing India with result true
  India
*/
