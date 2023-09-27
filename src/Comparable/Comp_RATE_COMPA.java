package Comparable;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Comp_RATE_COMPA {

	public static void main(String[] args) {

		Room piccadily = new Room("Piccadily","Guest Room",3,125.00);
		Room cambridge = new Room("Cambridge","Premiere Room",4,175.00);
		Room oxford = new Room("Oxford","Suite",5,225.00);
		Room oxfordGuest = new Room("Oxford","Guest Room",5,225.00);
		Room victoria= new Room("Victoria","Suite",5,225.00);
		
		List<Room>rooms= new ArrayList<>(List.of(piccadily,oxfordGuest,cambridge,victoria,oxford));
		
		rooms.sort(Room.RATE_COMPARATOR.reversed());
		
		rooms.stream()
		      .forEach(r-> System.out.format("%-15s %-15s %-10f %n", r.getName(),r.getRoom_type(),r.getRate()));

	}

}

/*
 * Comparator.comparing(Room::getRate) in Room class
Piccadily       Guest Room      125.000000 
Cambridge       Premiere Room   175.000000 
Oxford          Guest Room      225.000000 
Victoria        Suite           225.000000 
Oxford          Suite           225.000000


//  .thenComparing(Room::getName); in Room class added then we get
Piccadily       Guest Room      125.000000 
Cambridge       Premiere Room   175.000000 
Oxford          Guest Room      225.000000 
Oxford          Suite           225.000000 
Victoria        Suite           225.000000

 // .thenComparing(Room::getRoom_type); in Room Class
   Piccadily       Guest Room      125.000000 
Cambridge       Premiere Room   175.000000 
Oxford          Guest Room      225.000000 
Oxford          Suite           225.000000 
Victoria        Suite           225.000000 

//  .thenComparing(Room::getRoom_type); in Room Class and RATE_COMPARTOR.reversed()== gives us descending order
  Victoria        Suite           225.000000 
Oxford          Suite           225.000000 
Oxford          Guest Room      225.000000 
Cambridge       Premiere Room   175.000000 
Piccadily       Guest Room      125.000000 
  * 
 */
 
