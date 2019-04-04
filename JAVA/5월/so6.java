///1과 100사이의 정수중 3의 배수이면서 5으 배수이면서 9의 배수도 아닌것 출력
class so6 {
	public static void main(String[] args) {
	for (int a=1;a<=100 ;a++ )
	{
		if (a%3==0)
		{
			if (a%5!=0&&a%9!=0)
			{
				System.out.println(a);
			}
		}
	}
		}
}
