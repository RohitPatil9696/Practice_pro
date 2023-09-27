package Map_Swapping;

import java.util.HashMap;
import java.util.Map;

public class Swap_inmap {

	public static void main(String[] args) {
		Room piccadily = new Room("Piccadily","Guest Room",3,125.00);
		Room oxford = new Room("Oxford","Suite",5,225.0);
		
		Guest john = new Guest("John","Doe",false);
		Guest maria = new Guest("Maria","Doe",true);
		
		Map<Room, Guest> assignments= new HashMap<>();
		assignments.put(oxford, maria);
		assignments.put(piccadily, john);
		
		Guest guest = assignments.put(piccadily, assignments.remove(oxford));
		assignments.putIfAbsent(oxford, guest);
		
		System.out.println("Oxford: "+ assignments.get(new Room("Oxford","Suite",5,225.0)));
		System.out.println("Piccadily: "+assignments.get(piccadily));
		
	}

}
/*
 Oxford: null
Piccadily:  [Maria, Doe]
*/
