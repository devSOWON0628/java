abstract class person30
{
	String name;
	int age;

	public void go(){System.out.println("����");}
	abstract public void walk();//�߻�޼���
	abstract public int count(int num);//�߻�޼��� //�޼���
	
}
//peron30��ü�� ������ �ڽ��� ����� �޾ƾ� �Ѵ�.

abstract class child extends person30
{
	public void walk(){System.out.println("��������");}
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