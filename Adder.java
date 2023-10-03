import java.util.*;
public class Adder
{
	int[]  arr;
	int targetSum;
	Adder(int[] array,int ts)
	{
		arr=array;
		targetSum=ts;
	}
	void numsum()
	{
		int[] result=new int[8];
		for(int i=0;i<arr.length;i++)
		{
			int count=0;
			for(int j=i+1;j<arr.length;j++)
			{
				if((arr[i]+arr[j])==targetSum)
				{
					// int count=0;
					result[count]=arr[i];
					result[++count]=arr[j];
				}
				else
				{
					continue;
				}
			}
		}
		System.out.println("Result:");
		for(int i=0;i<result.length;i++)
		{
			System.out.println(result[i]);
		}
	}
	
	public static void main(String args[])
	{
		int[] a=new int[8];
		int targetsum;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter any 8 array elements:");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("enter target sum:");
		targetsum=sc.nextInt();
		Adder obj=new Adder(a,targetsum);
		// obj.putData();
		obj.numsum();
		// obj.displayResult();
	}
}