//Write a program to find out the greatest number among 3 numbers.
class Greatest
{
	int a, b, c;
	Greatest(int a, int b, int c)
	{
		this.a=a;
		this.b=b;
		this.c=c;
	}
	void display()
	{
		if(a>=b && a>=c)
			System.out.println(""+a+" is the greatest number");
		else if(b>=a && b>=c)
			System.out.println(""+b+" is the greatest number");
		else	
			System.out.println(""+c+" is the greatest number");
	}
}
class Ass3
{
	public static void main(String args[])
	{
		Greatest g=new Greatest(75, 60, 90);
		g.display();
	}
}
