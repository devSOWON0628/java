class car 
{
	private String brand, owner, company;
	private int price;

	public car(String brand, String owner, String company, int price)
	{
	this. brand=brand;
	this. owner=owner;
	this. company=company;
	this. price=price;
	}

	public car(String owner, String companay, int price)
	{
	this. owner=owner;
	this. company= company;
	this. price=price;
	
	}

	public car(String owner, int price)
	{
	this. owner=owner;
	this. price=price;
	
	}

	
	public String start(String a)
	{
	return a;
	}

	public String stop(String b)
	{
	return b;
	}
	

	public static void main(String[] args) 
	{
		car c1=new car("Sonata","mike","hyundai",210);
		car c2=new car("Alice","kia",300);
		car c3=new car("Tom",350);
		car c4=new car("Benz","Tomas","mk",500);
		
		System.out.print("���̸�:"+c3.brand+"  ������:"+c3.owner+"  ȸ��:"+c3.company+"  �� ����:"+c3.price);

		System.out.print(c1.start("  �޸���"));
		System.out.print(c1.stop("  ���ߴ�"));
	}
}
