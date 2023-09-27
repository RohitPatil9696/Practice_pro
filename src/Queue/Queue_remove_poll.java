package Queue;

import java.util.ArrayDeque;
import java.util.Queue;

import List.Guest;

public class Queue_remove_poll {

	public static void main(String[] args) {
		//1)insert_throw_exception        add() ==> offer() (Returns special value)
        //2)Remove_throw_exception     remove()==> poll() (Returns special value)
		//3)Examine_throw_exception   element() ==> peek() (Returns special value)
		
		Guest john = new Guest("john","Doe",false);
		Guest bob = new Guest("Bob", "Doe",false);
		Guest sonia =new Guest("Sonia","Doe",true);
		Guest siri = new Guest("Siri","Doe",true);
		
		Queue<Guest>checkinQueue = new ArrayDeque<>();
		Guest guest= checkinQueue.poll();
		System.out.println(guest);
		
	}
	public static void print(Queue<Guest>queue) {
		System.out.format("%n-- Queue contents--%n");
		int x=0;
		for(Guest guest:queue) {
			System.out.format("%x:%s %s %n", x++, guest.toString(), x==1 ? "(Head)":"");
		}
		System.out.println("");
		
		}
	}


//null

