class Student4 
{

	private String name;
	private int grade;
	private int ban;
	private int tel;

	public String study(String s)
		{
			return s;
		}

	public Student4(String n)
		{
			this.name=n;
		
		}

	public Student4(String n, int gra, int b, int tele)
		{
			this.name=n;
			this.grade=gra;
			this.ban=b;
			this.tel=tele;
		}

	public Student4(String n, int b, int tele)
		{
			this.name=n;
			this.ban=b;
			this.tel=tele;
		}

	public Student4(int gra,int b,int tele)
		{
			this.grade=gra;
			this.ban=b;
			this.tel=tele;
	
	     }

	public static void main(String[] args) 
	{
		Student4 s1=new Student4("�����");
		Student4 s2=new Student4("������");
		Student4 s3=new Student4("Tomas",1,1,1111);
		Student4 s4=new Student4("Jhon",6,2222);
		Student4 s5=new Student4(2,5,3333);



		System.out.println(s3.name+"�� "+s3.grade+"�г��̰� ��ȭ��ȣ�� "+s3.tel+"�Դϴ�");
		System.out.println(s5.study("����"));
	}
}
