package Queue;

import java.util.ArrayDeque;
import java.util.Queue;

import List.Guest;

public class Queue_remove {

	public static void main(String[] args) {
		Guest john = new Guest("john","Doe",false);
		Guest bob = new Guest("Bob", "Doe",false);
		Guest sonia =new Guest("Sonia","Doe",true);
		Guest siri = new Guest("Siri","Doe",true);
		
		Queue<Guest>checkinQueue = new ArrayDeque<>();
		
		checkinQueue.offer(john);
		checkinQueue.offer(bob);
		checkinQueue.offer(sonia);
		checkinQueue.offer(siri);
		print(checkinQueue);

		
		Guest guest = checkinQueue.remove();
		print(checkinQueue);
		System.out.println(guest);

		Guest guest1 = checkinQueue.element();
		print(checkinQueue);
		System.out.println(guest1);

	}

	public static void print(Queue<Guest> queue) {
		// TODO Auto-generated method stub
		System.out.format("%n-- Queue contents--%n");
		int x=0;
		for(Guest guest:queue) {
			System.out.format("%x:%s %s %n", x++, guest.toString(), x==1 ? "(Head)":"");
		}
		System.out.println("");
	}

}
/*
 * 
-- Queue contents--
0: [john, Doe] (Head) 
1: [Bob, Doe]  
2: [Sonia, Doe]  
3: [Siri, Doe]  


-- Queue contents--
0: [Bob, Doe] (Head) 
1: [Sonia, Doe]  
2: [Siri, Doe]  

 [john, Doe]

-- Queue contents--
0: [Bob, Doe] (Head) 
1: [Sonia, Doe]  
2: [Siri, Doe]  

 [Bob, Doe]

 */
 
