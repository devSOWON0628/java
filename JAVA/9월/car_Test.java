class car_Test 
{
	public static void main(String[] args) 
	{
		car c=new car();
		c.oil="�ֹ���";
		c.kind="BMW";
		c.color="������ ������";
		c.speed=300;
		c.number=3523;

		System.out.println("�� ���� "+c.oil+"�� �־�� �մϴ�. "+c.kind+"�� ��Դϴ� ���� \n"+ c.color+"��Ű���? "+ c.speed+"���� �ӵ��� �ö󰩴ϴ� ����"+ c.number+"�̰� �⺻ ����ȣ �Դϴ�");

		c.fast();
		c.sit();
		c.hot();
		c.pretty();

	}
}
