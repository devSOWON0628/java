class test9 
{
	int a,b;

	test9(int x, int y)
	{
	this(x);
	}

	test9(int i)
	{
	this.a=i;
	this(i);
	}
	
	test9(int j)
	{
	this.a=j;
	this.b=50;
	}

	public static void main(String[] args) 
	{
		test9 t=new test9(10,20);
		System.out.println("this()È£Ãâ");
	}
}
