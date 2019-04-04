//양수인지 음수인지 판단
class overloading_Test4 
{
	public void fan()
	{
	int x=-3;
	
	if (x<0)System.out.println(x+"는 음수입니다");
	else System.out.println(x+"는 양수입니다");
	
	}

	public void fan2(int x)
	{
	
	if (x<0)System.out.println(x+"는 음수입니다");
	else System.out.println(x+"는 양수입니다");
	
	}
	public String fan3()
	{
	int x=-3;
	if (x<0)return x+"은 음수입니다";
	else return x+"은 양수입니다";
	
	}

	public String fan4(int x)
	{
	if (x<0)return x+"은 음수입니다";
	else return x+"은 양수입니다";

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
