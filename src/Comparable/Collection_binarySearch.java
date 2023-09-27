package Comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Collection_binarySearch {

	public static void main(String[] args) {
		Room piccadily = new Room("Piccadily","Guest Room",3,125.00);
		Room cambridge = new Room("Cambridge","Premiere Room",4,175.00);
		Room oxford = new Room("Oxford","Suite",5,225.00);
		Room oxfordGuest = new Room("Oxford","Guest Room",5,225.00);
		Room victoria= new Room("Victoria","Suite",5,225.00);
		
		List<Room>rooms= new ArrayList<>(List.of(piccadily,oxfordGuest,cambridge,victoria,oxford));
		rooms.sort(Room.RATE_COMPARATOR);
		
		Room newLondon = new Room("New London","Suite",5,225.0);
		int result= Collections.binarySearch(rooms,newLondon,Room.RATE_COMPARATOR);
		rooms.add(Math.abs(++result),newLondon);
		System.out.println("Result:"+result);
		
		rooms.stream()
	      .forEach(r-> System.out.format("%-15s %-15s %-10f %n", r.getName(),r.getRoom_type(),r.getRate()));
		
		// next Question find min and max
       System.out.println("Min:"+ Collections.min(rooms,Room.RATE_COMPARATOR).getName());
       System.out.println("Max:"+ Collections.max(rooms,Room.RATE_COMPARATOR).getName());
	}

}
/*
 Result:-2
 
Piccadily       Guest Room      125.000000 
Cambridge       Premiere Room   175.000000 
New London      Suite           225.000000 
Oxford          Guest Room      225.000000 
Oxford          Suite           225.000000 
Victoria        Suite           225.000000 

Min:Piccadily
Max:Victoria
 */ 
