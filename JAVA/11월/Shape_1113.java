class Shape_1113 
{
	public void draw(){
	System.out.println("���� �׸���");
	
	}
	public void painting(){System.out.println("�θ� ��ĥ�ϱ�");}//���߿� ����� ���⵵ �־��ش�
}
class circle extends Shape_1113
{
	public void draw(){System.out.println("�� �׸���");}
	public void painting(){System.out.println("��ĥ�ϱ�");}
}
class casting_Test
{
	public static void main(String ar[])
	{
		Shape_1113 s= new Shape_1113();
		s.draw();//�����׸��Ⱑ ��µȴ�
		s.painting();//������ ������ ����.

		circle c1= new circle();
		c1.draw();//�� �׸��� �� ��µȴ�.
		c1.painting();//��ĥ�ϱ� ����µȴ�.

		Shape_1113 s2=c1;//c1�� s2�� �ִ´ٴ� �� s2�� �θ�Ÿ�� c1�� �ڽ�Ÿ���̶� up casting
		s2.draw();//���׸��� ��µȴ�.
		s2.painting();
	
	}
}
