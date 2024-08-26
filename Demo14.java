//Write a program in Java to display the volume of a box. You have to use two Parameterized constructor, one having three parameters and one having one parameter. Also use a display method to print the volume of the box.

class Box
{
	double length, breadth, height;
	Box(double len)
	{
		this.length=len;
		this.breadth=len;
		this.height=len;
	}
	Box(double length, double breadth, double height)
	{
		this.length=length;
		this.breadth=breadth;
		this.height=height;
	}
	void display()
	{
		System.out.println("Volume: "+length*breadth*height);
	}
}
class Demo14
{
	public static void main(String args[])
	{
		Box obj1=new Box(20);
		Box obj2=new Box(10, 20, 30);
		obj1.display();
		obj2.display();
	}
}