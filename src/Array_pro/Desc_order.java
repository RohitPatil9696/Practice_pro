package Array_pro;

public class Desc_order {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] arr= {50,45,90,70,100};
		int temp=0;
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]<arr[j])
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
