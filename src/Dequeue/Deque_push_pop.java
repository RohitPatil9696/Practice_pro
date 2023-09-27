package Dequeue;

import java.util.ArrayDeque;
import java.util.Deque;

public class Deque_push_pop {

	public static void main(String[] args) {
		Deque<String> messageStack = new ArrayDeque<>();
		messageStack.push("Message 1");
		messageStack.push("Message 2");
		messageStack.push("Message 3");
		messageStack.push("Message 4");
		print(messageStack);
		System.out.println(messageStack.pop());
		System.out.println(messageStack.pop());
		System.out.println(messageStack.peek());
		print(messageStack);
	}

	public static void print(Deque<String> deque) {
		System.out.format("%n--Deque Content --%n");
		int x=0;
		for(String guest:deque) {
			System.out.format("%x:%s %s %n", x++, guest.toString(), x==1 ? "(Head)":"");
		}
		System.out.println("");
	}

}

/*
 --Deque Content --
0:Message 4 (Head) 
1:Message 3  
2:Message 2  
3:Message 1  

Message 4
Message 3
Message 2

--Deque Content --
0:Message 2 (Head) 
1:Message 1  


*/
