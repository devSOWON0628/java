abstract class person30
{
	String name;
	int age;

	public void go(){System.out.println("가다");}
	abstract public void walk();//추상메서드
	abstract public int count(int num);//추상메서드 //메서드
	
}
//peron30객체를 못만들어서 자식이 상속을 받아야 한다.

abstract class child extends person30
{
	public void walk(){System.out.println("파파파파");}
}

class child2 extends child
{
	public int count(int num){return num*10;}
}


class abstract_test
{
	public static void main(String ar[])
	{
		child2 c2= new child2();
		c2.walk();
		System.out.println(c2.count(10));
	
	
	}
}