package Array_pro;

public class Second_large {

	public static int getsecondlast(int arr[],int total)
	{
		int temp=0;
		for(int i=0;i<arr.length;i++)
		   {
			   for(int j=i+1;j<arr.length;j++)
			   {
				   if(arr[i]>arr[j]) 
				   {
					   temp=arr[i];
					   arr[i]=arr[j];
					   arr[j]=temp;
				   }
			   }
		   }

		return arr[total-2];
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
         int arr[]= {15,20,25,30,75,10};
         int total= arr.length;
         System.out.println("Second last largest number is "+getsecondlast(arr,6));
	}

}
