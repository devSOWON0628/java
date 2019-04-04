class Animal2 
{

	private String name, owner;
	int leg;

	public Animal2(String name, String owner, int leg)
		{
		this. name=name;
		this. owner=owner;
		this. leg=leg;
		}
	
	public Animal2(String name, String owner)
		{
		this. name=name;
		this. owner=owner;
		}

	public Animal2(String onwer, int leg)
		{
		this. owner=owner;
		this. leg= leg;
		}

	public void setName(String name)
		{
		this. name=name;
		}

	public String getName()
		{
		return name;
		}
	
	public void setOwner(String owner)
		{
		this. owner=owner;
		}

	public String getOwner()
		{
		return owner;
		}

	public static void main(String[] args) 
	{
		Animal2 a1= new Animal2("cat","mike",4);
		Animal2 a2= new Animal2("dog","alice");
		Animal2 a3= new Animal2("tom",3);

		a2.setOwner("tomas");
		a3.setName("sheep");
	

		
		System.out.println(a3.getName());
		System.out.println(a2.getOwner());

		


	}
}
