
public class SelectionSort {
	public static void printArray(int arr[]) {
		for(int i=0;i<arr.length;i++)//printing k liye h ye loop
		{
			System.out.print(arr[i]);
		}
		System.out.println();
		}
	public static void main(String args[])
	{
		int arr[]= {7,8,3,1,2};
		for (int i =0;i<arr.length-1;i++)
		{
			int smallestNum=i;
			for(int j=i+1;j<arr.length;j++)
			{
				if (arr[smallestNum]>arr[j]) {
					smallestNum=j;
				}
			}
			int k=arr[smallestNum];
			arr[smallestNum]=arr[i];
			arr[i]=k;
			
		}
		printArray(arr);
}
}
