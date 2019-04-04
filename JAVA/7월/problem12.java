//12.정수를입력받아서 1부터 입력받은 정수까지의 5의 배수의 합을 구하여 출력하는 프로그램을 작성
class problem12 {
	public static void main(String ar[]) {
		int a=Integer.parseInt(ar[0]);
		int b=Integer.parseInt(ar[1]);
		int big,small,sum=0;

		if (a>b)
		{
			big=a;
			small=b;
		}
		else {small=a;
		big=b;}

		for (int i=small;i<=big ;i++ )
		{
			if (i%5==0)
			{
				sum+=i;
			}

		}
		System.out.println(sum);
	}
}
