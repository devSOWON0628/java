//������� �������� �Ǵ�
class overloading_Test4 
{
	public void fan()
	{
	int x=-3;
	
	if (x<0)System.out.println(x+"�� �����Դϴ�");
	else System.out.println(x+"�� ����Դϴ�");
	
	}

	public void fan2(int x)
	{
	
	if (x<0)System.out.println(x+"�� �����Դϴ�");
	else System.out.println(x+"�� ����Դϴ�");
	
	}
	public String fan3()
	{
	int x=-3;
	if (x<0)return x+"�� �����Դϴ�";
	else return x+"�� ����Դϴ�";
	
	}

	public String fan4(int x)
	{
	if (x<0)return x+"�� �����Դϴ�";
	else return x+"�� ����Դϴ�";

	}

	
	public static void main(String[] args) 
	{
		overloading_Test4 f = new overloading_Test4();
		f.fan();
		f.fan2(-3);
		System.out.println(f.fan3());
		System.out.println(f.fan4(-3));

		
	}
}
