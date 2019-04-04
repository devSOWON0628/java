class person7
{
	String name;
	int age;
	int height;


	person7(String n, int h)
		{
			this(h);
			this.name=n;
		}
	person7(String name, int age, double height)
		{
			this(name,height);
		}
	person7(int x)
		{
			this.height=x;
		}

	

	public static void main(String[] args) 
	{
		person7 p=new person7("Mike",30,180);
		
	}
}
