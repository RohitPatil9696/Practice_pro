package List;

public class Guest {
	String Name;
	String Sirname;
	boolean result;
	
	
	public Guest()
	{
		this.Name="Ram";
		this.Sirname="Patil";
		this.result=true;
	}
	
	public Guest(String name, String sirname, boolean result) {
		super();
		Name = name;
		Sirname = sirname;
		this.result = result;
	
	}



	public String getName() {
		return Name;
	}



	public void setName(String name) {
		Name = name;
	}



	public String getSirname() {
		return Sirname;
	}



	public void setSirname(String sirname) {
		Sirname = sirname;
	}



	public boolean isResult() {
		return result;
	}



	public void setResult(boolean result) {
		this.result = result;
	}

	@Override
	public String toString() {
		return " [" + Name + ", " + Sirname + "]";
	}
	

}

