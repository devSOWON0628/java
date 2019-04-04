class tv_Test 
{
	public static void main(String[] args) 
	{
		tv t=new tv();
		t.size=200;
		t.color="ÇÏ¾á»ö";
		t.company="»ï¼º";
		t.weigh=50;

		System.out.println(t.size+"cm\n"+t.color+"\n"+t.company+"\n"+t.weigh+"g");

		t.joy();
		t.chanel();
		t.on();
	}
}
