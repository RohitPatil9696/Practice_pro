package Array_pro;

public class Asc_order {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int [] arr= {30,20,45,65,40,70};
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
			System.out.print(arr[i]+",");
		}
		

	}

}
