class A
{
	int a=10;
	public void display()
	{
		System.out.println("hello from A class");
	}
}
class B extends A
{
	public void hello()
	{
		System.out.println("Hello from class B");
	}
}
class testing
{
	 public static void main(String[] args)
	{
			B obj=new B();
			System.out.println(obj.a);
	}
}