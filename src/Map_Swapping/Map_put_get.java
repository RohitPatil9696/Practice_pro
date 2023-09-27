package Map_Swapping;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Map_put_get {

	public static void main(String[] args) {
		Room piccadily = new Room("Piccadily","Guest Room",3,125.00);
		Room oxford = new Room("Oxford","Suite",5,225.0);
		
		Guest john = new Guest("John","Doe",false);
		Guest maria = new Guest("Maria","Doe",true);
		
		Map<Room, Guest> assignments= new HashMap<>();
		assignments.put(oxford, maria);
		assignments.put(piccadily, john);
		
		for(Entry<Room, Guest> entry : assignments.entrySet()) {
			Room r = entry.getKey();
			Guest g =entry.getValue();
			System.out.format("%s : %s%n", r.getName(),g.getName());
			

			}

	}

}
/*
Piccadily : John
Oxford : Maria
*/
