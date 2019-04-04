class caar
{
	String name;
	int engine;
	
	void clack()
	{
		System.out.println("¶ì¶ì~~");
	}
}
class truck extends caar
{
	String name;
	int engine, carry;
	void clack()
	{
	System.out.println("»§»§!");
	}

	void carry(int carry)
	{
	carry=carry*3;
	}

	truck(int carry)
	{
	this.carry=carry;
	}

}
class sportcar extends caar
{
	String name;
	int engine, carry;
	void clack()
	{
	System.out.println("»Ñ¿Í¾Ó–Ø¾Ó!!");
	}

	void carry(int carry)
	{
	carry=carry*3;
	}

	sportcar(int carry)
	{
	this.carry=carry;
	}
}

class caar_1207test
{
	public static void main(String ar[])
	{
	caar c=new caar();
	c.clack();
	truck t=new truck(3);
	t.clack();
	sportcar s=new sportcar(3);
	s.clack();
	}
}