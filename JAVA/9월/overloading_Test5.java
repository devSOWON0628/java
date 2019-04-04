//두수 사이의 합
class overloading_Test5
{
	public void hab()
	{
		int big,small,sum=0;
	int x=1,y=10;

	if (x>y)
	{big=x;
	small=y;
	}
	else small=x; big=y;
	for (;small<=big ;small++ )
	{
		sum+=small;
	}
	System.out.println(sum);
	
	}

	public int hab2()
	{
	int big,small,sum=0;
	int x=1,y=10;
	if (x>y)
	{big=x;
	small=y;
	}
	else small=x; big=y;
	for (;small<=big ;small++ )
	{
		sum+=small;
	}
	return sum;
	}



	public void hab3(int x,int y)
	{
	int big,small,sum=0;

	if (x>y)
	{
	big=x;
	small=y;
	}
	else small=x; big=y;
	for (;small<=big ;small++ )
	{
		sum+=small;
	}
	System.out.println(sum);
	
	}

	public int hab4(int x,int y)
	{
	int big,small,sum=0;

	if (x>y)
	{big=x;
	small=y;
	}
	else small=x; big=y;
	for (;small<=big ;small++ )
	{
		sum+=small;
	}
	return sum;
	
	
	}
	


	public static void main(String[] args) 
	{
		overloading_Test5 t=new overloading_Test5();
		t.hab();
		System.out.println(t.hab2());
		t.hab3(1,10);
		System.out.println(t.hab4(1,10));
	}
}
