//절댓값 구하기
class overloading_Test3 
{
	public void jur()
	{
	int i=-3;
	if (i<0)i=-i;
	System.out.println("절대값은"+i+"입니다");
	}

	public String jur2()
		{
			int i=-3;
			if (i<0)i=-i;
			return "절대값은"+i+"입니다";
		}

	public void jur3(int i)
		{
		if (i<0)i=-i;
		System.out.println("절대값은"+i+"입니다");
	
		}

	public String jur4(int i)
		{
		if (i<0)i=-i;
		return "절대값은"+i+"입니다";
		}



	public static void main(String[] args) 
	{
		overloading_Test3 o3=new overloading_Test3();
		o3.jur();
		System.out.println(o3.jur2());
		o3.jur3(-3);
		System.out.println(o3.jur4(-3));

	}
}
