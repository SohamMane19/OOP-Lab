import java.util.*;
//assignment 3
class Shape
{
	public void getInputs()
	{
		System.out.println("I am a shape");
	}
	public void setArea()
	{
		System.out.println("I am a area");
	}
}
class Triangle extends Shape
{
	int h,b;
	public void getInputs(int height,int base)
	{
		h=height;
		b=base;
	}
	public void setArea()
	{
		float area=0.5f*(b*h);
		System.out.println("Area of triangle:"+area);
	}
}
class Square extends Shape
{
	int s;
	public void getInputs(int side)
	{
		s=side;
	}
	public void setArea()
	{
		float area=s*s;
		System.out.println("Area of square:"+area);
	}
}
class Circle extends Shape
{	
	float p;
	int r;
	// static final float pi=3.14;
	public void getInputs(float Pie,int R)
	{
		p=Pie;
		r=R;
	}
	public void setArea()
	{
		float area=p*(r*r);
		System.out.println("Area of circle:"+area);
	}
}
class Tester
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		
		Triangle t=new Triangle();
		int h,b;
		System.out.println("Enter triangle dimensions");
		System.out.println("Enter height:");
		h=sc.nextInt();
		System.out.println("Enter base:");
		b=sc.nextInt();
		t.getInputs(h,b);
		t.setArea();

		Square sq=new Square();
		int dim;
		System.out.println("Enter square dim:");
		dim=sc.nextInt();
		sq.getInputs(dim);
		sq.setArea();

		Circle c=new Circle();
		int radius;
		System.out.println("Enter circle radius:");
		radius=sc.nextInt();
		c.getInputs(3.14f,radius);
		c.setArea();
	}
}
