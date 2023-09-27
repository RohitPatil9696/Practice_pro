package Array_pro;

public class Large_num {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     int arr[]={4,7,2,8,1,3};
     int large=arr[0];
     for(int i=0;i<arr.length;i++)
     {
    	 if(large<arr[i])
    	 {
    		 large=arr[i];
    	 }
     }
     System.out.println("Largest Number in the Array is "+large);
	}

}
