class Parent
{
	int x = 10;
	double y = 10.11;

	public void disp()
	{
		System.out.println("Inside parent class");
	}
}

class Child extends Parent
{
	int x = 20;
	double y = 20.11;

	public void modify()
	{
		int x = 30;
		double y = 30.11;

		this.x = x + this.x +super.x;
		this.y = y + this.y + super.y;
	}

	public void print()
	{
		int x =43;
		double y = 54.34;

		System.out.println("x = "+this.x);
		System.out.println("x = "+this.y);
	}
}

class Program3 
{
	public static void main(String[] args) 
	{
		Child c = new Child();
		c.modify();
		c.print();

	}
}
