class car_Test 
{
	public static void main(String[] args) 
	{
		car c=new car();
		c.oil="휘발유";
		c.kind="BMW";
		c.color="강렬한 빨간색";
		c.speed=300;
		c.number=3523;

		System.out.println("이 차는 "+c.oil+"를 넣어야 합니다. "+c.kind+"라서 비쌉니다 고객님 \n"+ c.color+"어떠신가요? "+ c.speed+"까지 속도가 올라갑니다 고객님"+ c.number+"이게 기본 차번호 입니다");

		c.fast();
		c.sit();
		c.hot();
		c.pretty();

	}
}
