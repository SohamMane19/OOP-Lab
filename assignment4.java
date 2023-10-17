import java.util.*;

class assignment4
{
	static void findlen(String val)
	{
		System.out.println(val.length());
	}
	public static void main(String[] args)
	{
		boolean flag=true;
		int choice;
		Scanner sc=new Scanner(System.in);
		while(flag)
		{
			System.out.println("1)Divide number by zero exception\n2)Array index out of bounds\n3)Null pointer exception\nEnter your choice:");
			choice=sc.nextInt();
			if(choice==1)
			{
				int a;
				int result;
				System.out.println("enter a number:");
				a=sc.nextInt();
				try
				{
					result=a/0;
					System.out.println(result);
				}
				catch(Exception e)
				{
					System.out.println("You shouldn’t divide a number by zero.");
				}
			}
			else if(choice==2)
			{
				int arr[]={1,2,3,4,5,6};
				System.out.println("Accessing element at index 7:");
				try
				{
					System.out.println(arr[7]);
				}
				catch(Exception e)
				{
					System.out.println("OOPs!!!Array Index 7 out of bounds for length 6.");
				}
			}

			else if(choice==3)
			{
				String str=null;
				try
				{
					findlen(str);
				}
				catch(Exception e)
				{
					System.out.println("Null Pointer Exception arises!!");
				}
			}
			else
			{
				System.out.println("exited!");
				flag=false;
			}				
		}
	}
}