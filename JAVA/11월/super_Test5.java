class greeting
{
	String name="mike";
	public void sayHello(){
		System.out.println("¾È³ç");
	}
}
class EngHello extends greeting
{
	String name="moon";
	public void sayHello(){
		System.out.println("nice to meet you");
	}
	public void test(){
		System.out.println(super.name);
		super.sayHello();
	}
}
class super_Test5
{
	public static void main(String ar[])
	{
	EngHello e=new EngHello();
	e.test();
	e.sayHello();
	}
}
