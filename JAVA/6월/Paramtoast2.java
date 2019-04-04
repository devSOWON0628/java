//2.100이하의 두개의 정수를 입력받아 작은 수부터 큰수까지 차례대로 출력
class Paramtoast2{
	public static void main(String ar[] ) {
		int a=Integer.parseInt(ar[0]);
		int b=Integer.parseInt(ar[1]);
		int big,small,i;
		if (a>b)
		{
           big=a;
		   small=b;
		}
		else
			{
			big=b;
			small=a;
		}

		if (a>100||b>100)
		{
			System.out.println("프로그램을 종료합니당 100이하의 숫자를 입력해주세용");
		}

		for (i=small;i<=big ;i++)
		{
			System.out.println(+i);
		}



		

	}
}
