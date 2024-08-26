//For Instance and display data write proper setData() and displayData() function. Create a Demo class and demonstrate by creating 2 objects inside main() function.(EXAMPLE 1)


class Box
{
	double length, breadth, height;
	void setData(double length, double breadth, double height)
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
class Demo11
{
	public static void main(String args[])
	{
		Box obj1=new Box();
		obj1.setData(10, 20, 30);
		obj1.display();
		System.out.println("Volume of Box 1: "+obj1.volume());
		Box obj2=new Box();
		obj2.setData(40, 50, 60);
		obj2.display();
		System.out.println("Volume of Box 2: "+obj2.volume());
	}
}
		