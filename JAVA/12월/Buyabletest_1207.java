interface Buyable
{
	public int getPrice();
}
class Television implements Buyable
{
	String model;
	String maker;
	int price;

	Television(String model, String maker, int price)
	{
		this.model=model;
		this.maker=maker;
		this.price=price;
	}

	public int getPrice()
	{
	return price;
	}
}

class Buyabletest_1207
{
	public static void main(String ar[])
	{
		Television t=new Television("KV-102", "LG", 300);
		System.out.println(t.model+", "+t.maker+", "+t.price);
	}
}
