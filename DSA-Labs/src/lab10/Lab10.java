package lab10;

public class Lab10 {
	
	static void bubblesort(int arr[])
	{
		int l=arr.length;
		//For traversing array(passes)
		for(int i=0;i<=l-2;i++)
		{
			//for comparing elements
			for(int j=0;j<=l-2;j++)
			{
			if (arr[j]>arr[j+1])
			{
				int temp=arr[j];
				arr[j]=arr[j+1];
				arr[j+1]=temp;
			}
			}
		}
	}
	static void printArray(int arr[])
	{
		for(int i=0;i<=arr.length-1;i++)
		{
			System.out.print(arr[i]+ " ");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {3,4,7,1,2,5};
		printArray(arr);
		System.out.println("Sorted Array");
		bubblesort(arr);
		printArray(arr);
	}

}
