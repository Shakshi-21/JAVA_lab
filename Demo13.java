class Box
{
	double length, breadth, height;
	Box(double length, double breadth, double height)
	{
		this.length=length;
		this.breadth=breadth;
		this.height=height;
	}
	double volume()
	{
		return length*breadth*height;
	}
	void display()
	{
		System.out.println("Length: "+length+"\nBreadth: "+breadth+"\nHeight: "+height);
	}
}
class Demo13
{
	public static void main(String args[])
	{
		Box obj1=new Box(10, 20, 30);
		obj1.display();
		System.out.println("Volume of Box 1: "+obj1.volume());
		Box obj2=new Box(30, 40, 50);
		obj2.display();
		System.out.println("Volume of Box 2: "+obj2.volume());
		if(obj1.volume()>obj2.volume())
			System.out.println("Size of box 1 is bigger");
		else if(obj2.volume()>obj1.volume())
			System.out.println("Size of box 2 is bigger");
		else
			System.out.println("Both Box of same size");
	}
}