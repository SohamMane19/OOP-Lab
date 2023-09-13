import java.util.*;
class calc
{
	int a,b,choice;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a:");
		a=sc.nextInt();
		System.out.println("Enter b:");
		b=sc.nextInt();
		System.out.println("Choose:\n1)Add\n2)Subtract\n3)Divide\n4)Modulo\n5)Multiply\n");
		choice=sc.nextInt();
			if(choice==1)
			{
				System.out.println("Addition:"+(a+b));
			}
			if(choice==2)
			{
				System.out.println("Subtraction:"+(a-b));

			}
			if(choice==3)
			{
				System.out.println("Division:"+(a/b));
				
			}
			if(choice==4)
			{
				System.out.println("Modulo:"+(a%b));
				
			}
			if(choice==5)
			{
				System.out.println("Multiplication:"+(a*b));
				
			}
		
	public static void main(String args[])
	{
		// System.out.println("Exited!");
	}
}
