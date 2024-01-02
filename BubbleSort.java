
public class BubbleSort 
{
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
	
	for(int i=0;i<arr.length-1;i++)//n-1 times ye loop run hoga.(n is number of digits involved)
	{
	for(int j=0;j<arr.length-i-1;j++)//j is andar ke digits
	{if(arr[j]>arr[j+1])
	{
		//swapping
		int k;
	k=arr[j];
	arr[j]=arr[j+1];
	arr[j+1]=k;
	}
	}
	}
	printArray(arr);//printArray method call hoga to print the result
}
}
