package List;

import java.util.ArrayList;
import java.util.List;

public class Guest_List_add {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Guest john= new Guest("john","Doe",false);
		Guest maria= new Guest("Maria","Doe",false);
		Guest sonia= new Guest("Sonia","Doe",true);
		Guest siri= new Guest("Siri","Doe",true);
		
		List<Guest>checkinList= new ArrayList<>(100);
		checkinList.add(john);
		checkinList.add(maria);
		
		print(checkinList);//1)))ans is below
		
		checkinList.add(0,sonia);
		print(checkinList); //2)))ans
		
		checkinList.get(2).setResult(true);
		checkinList.addAll(1, List.of(maria,siri));
		print(checkinList); //3)))ans
		
		checkinList.remove(checkinList.size()-1);
		print(checkinList);//4)))ans
		
		
		System.out.println(checkinList.indexOf(john));//5)))
		//indexOf() returns -1 if no value is present in the list.
	}


	
		public static void print(List<Guest> list) {
			System.out.format("%n--List Content ---%n");
			
			for(int x =0; x<list.size();x++) {
				Guest guest=list.get(x);
				System.out.format("%x: %s %n", x, guest.toString());
			}
		
	}

}
/*
1))) * --List Content ---
0:  [john, Doe] 
1:  [Maria, Doe] 

2)))--List Content ---
0:  [Sonia, Doe] 
1:  [john, Doe] 
2:  [Maria, Doe]

3)))-List Content ---
0:  [Sonia, Doe] 
1:  [Maria, Doe] 
2:  [Siri, Doe] 
3:  [john, Doe] 
4:  [Maria, Doe] 

4)))--List Content ---
0:  [Sonia, Doe] 
1:  [Maria, Doe] 
2:  [Siri, Doe] 
3:  [john, Doe]

5))) 3
*/