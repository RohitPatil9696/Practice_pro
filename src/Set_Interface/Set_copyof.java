package Set_Interface;

import java.util.LinkedHashSet;
import java.util.Set;

import Collection.Room;

public class Set_copyof {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Room piccadily = new Room("Piccadily","Guest Room",3,125.00);
        Room oxford = new Room("Oxford","Suite",5,225.0);
        Room oxfordDuplicate = new Room("Oxford","Suite",5,225.0);
        Room victoria = new Room("Victoria","Suite",5,225.00);
        
        Set<Room>otherRooms= Set.of(piccadily,oxford);
        
        Set<Room>rooms= new LinkedHashSet<>();
        rooms.add(piccadily);
        rooms.add(oxford);
        rooms.add(oxford);
        rooms.add(oxfordDuplicate);
        rooms.add(victoria);
		
        Set<Room> moreRooms = Set.copyOf(rooms);
        
        moreRooms.stream()
        .map(r-> r.getName())
        .forEach(System.out::println);
	}

}
/*
 * hyncha order change hote each run la
Victoria
Piccadily
Oxford
Oxford
*/