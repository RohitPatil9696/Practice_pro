package Comparable;

import java.util.LinkedHashSet;
import java.util.Set;

public class UnsupportedOperationException {

	public static void main(String[] args) {
		Room piccadily = new Room("Piccadily","Guest Room",3,125.00);
		Room oxford = new Room("Oxford","Suite",5,225.00);
		Room oxfordDuplicate = new Room("Oxford","Suite",5,225.00);
		Room victoria= new Room("Victoria","Suite",5,225.00);
		
	
		Set<Room>otherRooms = Set.of(piccadily,oxford);
		otherRooms.add(victoria);
		
		Set<Room>rooms= new LinkedHashSet<>();
	    rooms.add(piccadily);
	    rooms.add(oxford);
	    rooms.add(oxford);
	    rooms.add(oxfordDuplicate);
	    
	    rooms.stream()
	          .map(r-> r.getName())
	          .forEach(System.out::println);
	    
	}

}
/*
 * Exception in thread "main" java.lang.UnsupportedOperationException
	at java.base/java.util.ImmutableCollections.uoe(ImmutableCollections.java:142)
	at java.base/java.util.ImmutableCollections$AbstractImmutableCollection.add(ImmutableCollections.java:147)
	at Comparable.UnsupportedOperationException.main(UnsupportedOperationException.java:16)
   
    //Set.of() can take upto 9 arguments.
    //Of() and copyof() generates unmodifiable sets.

 */
 
