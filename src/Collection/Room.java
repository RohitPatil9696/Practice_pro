package Collection;

public class Room {

	  String name;
	  String room_type;
	  int room_no;
	  double rate;
	 boolean petFriendly;
	
	public Room()
	  {
	 	 this.name="ROBERT";
	 	 this.room_type="Large_Empire";
	 	 this.room_no=7;
	 	 this.rate =1000.00;
	 	
	  }  
 public Room(String name, String room_type, int room_no, double rate) {
		super();
		this.name = name;
		this.room_type = room_type;
		this.room_no = room_no;
		this.rate = rate;
	}
 
 public void setPetFriendly(boolean petFriendly) {
		this.petFriendly = petFriendly;
	}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getRoom_type() {
	return room_type;
}
public void setRoom_type(String room_type) {
	this.room_type = room_type;
}
public int getRoom_no() {
	return room_no;
}
public void setRoom_no(int room_no) {
	this.room_no = room_no;
}
public double getRate() {
	return rate;
}
public void setRate(double rate) {
	this.rate = rate;
}
@Override
public String toString() {
	return "Room [name=" + name + ", room_type=" + room_type + ", room_no=" + room_no + ", rate=" + rate + "]";
}

public boolean isPetFriendly() {
	// TODO Auto-generated method stub
	if(this.petFriendly)
	return true;
	
	else
		return false;
	
}



}
