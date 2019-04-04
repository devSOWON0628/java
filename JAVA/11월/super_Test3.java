class  parent
{
	int x=10;
}

class child extends parent
{
	int x=20;
	public void method(){
		System.out.println("x="+x);
		System.out.println("this.x="+this.x);
		System.out.println("super.x="+super.x);
	}
}

class super_Test3
{
	public static void main(String ar[])
	{
	child c= new child();
	c.method();
	
	}
}
