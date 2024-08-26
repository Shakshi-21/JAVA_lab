//Write program to perform addition, subtraction, multiplication and division.

class Operators
{
	int a, b;  //Declaring Instance_Variables
	Operators(int a, int b)   //Constructor to initialise the variables
	{
        	this.a = a;
        	this.b = b;
   	}
	int Sum()
	{
		return a+b;
	}
	int Difference()
	{
		return b-a;
	}
	int Product()
	{
		return a*b;
	}
	float Quotient()
	{
		return (float)b/a;
	}
	void display()
	{
		System.out.println("Add: "+Sum()+"\nDifference: "+Difference()+"\nProduct: "+Product()+"\nQuotient: "+Quotient());
	}
}	
class Ass2
{
	public static void main(String args[])
	{
		Operators Op=new Operators(10, 20);
		Op.display();
	}
}

