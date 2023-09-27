package List;

import java.util.ArrayList;
import java.util.List;

public final class List_ArrayList_get {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Guest john= new Guest("john","Doe",false);
		Guest maria= new Guest("Maria","Doe",false);
		Guest Sonia= new Guest("Sonia","Doe",true);
		Guest siri= new Guest("Siri","Doe",true);
		
		List<Guest>checkinList= new ArrayList<>(100);
		checkinList.add(john);
		checkinList.add(maria);
		
		print(checkinList);
	}

	public static void print(List<Guest> list) {
		System.out.format("%n--List Content ---%n");
		
		for(int x =0; x<list.size();x++) {
			Guest guest=list.get(x);
			System.out.format("%x: %s %n", x, guest.toString());
		}
	}
	/*
	 * --List Content ---
	0:  [john, Doe] 
	1:  [Maria, Doe] 
	 */
	 
}
