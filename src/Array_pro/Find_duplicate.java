package Array_pro;

public class Find_duplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          int arr[]= {10,50,20,30,20,40,50};
           
           for(int i=0;i<arr.length;i++)
           {
        	   for(int j=i+1;j<arr.length;j++)
        	   {
        		   if(arr[i]==arr[j])
        		   {
        			   System.out.print(arr[j]+",");
        		   }
        	   }
           }
          
          
	}

}
