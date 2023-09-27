package Array_pro;

public class Small_num {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     int arr[]=new int[] {25,20,46,10,30};
     int small=arr[0];
     for(int i=0;i<arr.length;i++)
     {
    	 if(small>arr[i])
    	 {
    		 small=arr[i];
    	 }
     }
		System.out.println("The Smallest number in given Array is "+small);
		
	}

}
