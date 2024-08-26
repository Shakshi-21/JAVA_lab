//Create a Box class and add method called setData() to initialized the data members. Add another method that will return volume of the Box. Using Demo class to demonstrate by creating two objects and find which box has bigger size.

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
class Demo10
{
	public static void main(String args[])
	{
		Box obj1 = new Box();
		Box obj2 = new Box();
		obj1.setData(10, 20, 30);
		obj2.setData(20, 30, 40);
		obj1.display();
		System.out.println("Volume of the box1: "+obj1.volume());
		System.out.println("Volume of the box2: "+obj2.volume());
		if(obj1.volume()>obj2.volume())
			System.out.println("Size of box1 is bigger");
		else if(obj2.volume()>obj1.volume())
			System.out.println("Size of box2 is bigger");
		else
			System.out.println("Both ppf equal size");
	}
}