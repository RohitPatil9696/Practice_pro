package Set_Interface;

import Collection.Room;
import java.util.HashSet;
import java.util.Set;

public class Set_HashSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Room piccadily = new Room("Piccadily","Guest Room",3,125.00);
        Room oxford = new Room("Oxford","Suite",5,225.0);
        Room oxfordDuplicate = new Room("Oxford","Suite",5,225.0);
        Room victoria = new Room("Victoria","Suite",5,225.00);
        
        Set<Room>rooms= new HashSet<>();
        rooms.add(piccadily);
        rooms.add(oxford);
        rooms.add(oxford);
        rooms.add(oxfordDuplicate);
        
        rooms.stream()
                    .map(r->r.getName())
                    .forEach(System.out::println);
	}

}
/* reverse order se HashSet mai print hota hai and oxfordDuplicate nahi liya
Oxford
Oxford
Piccadilly
*/