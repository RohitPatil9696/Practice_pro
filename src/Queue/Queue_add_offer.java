package Queue;

import java.util.ArrayDeque;
import java.util.Queue;

import List.Guest;

public class Queue_add_offer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Guest john = new Guest("john","Doe",false);
		Guest bob = new Guest("Bob", "Doe",false);
		Guest sonia =new Guest("Sonia","Doe",true);
		Guest siri = new Guest("Siri","Doe",true);
		
		Queue<Guest>checkinQueue = new ArrayDeque<>();
		
		checkinQueue.offer(john);
		checkinQueue.offer(bob);
		print(checkinQueue);
		
		Guest guest = checkinQueue.poll();
		print(checkinQueue);
		System.out.println(guest);
	}

	public  static void print(Queue<Guest> queue) {
		System.out.format("%n-- Queue contents--%n");
		int x=0;
		for(Guest guest:queue) {
			System.out.format("%x:%s %s %n", x++, guest.toString(), x==1 ? "(Head)":"");
		}
		System.out.println("");
		
	}

}
/*

-- Queue contents--
0: [john, Doe] (Head) 
1: [Bob, Doe]  


-- Queue contents--
0: [Bob, Doe] (Head) 

 [john, Doe]
*/
	 
