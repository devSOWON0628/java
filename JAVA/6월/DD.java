//1~10까지 3의 배수 제외 출력
class DD {
	public static void main(String[] args) {
	for (int i=1;i<=10 ;i++ )
	{
		if (i%3==0)
		{
			continue;
		}
		System.out.println(i);
	}
	}
	}
