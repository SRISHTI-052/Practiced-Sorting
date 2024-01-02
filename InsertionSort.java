
public class InsertionSort {
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
		for(int i=1;i<arr.length;i++)
			{int current=arr[i];
		int j=i-1;
		while(j>=0 &&current<arr[j])//sorted part ke liye hai ye loop backward to forward jane k liye
		{
			arr[j+1]=arr[j];
					j--;
		}
		//this is for placement of the digits in order
		arr[j+1]=current;
			
		}
printArray(arr);
	}}
