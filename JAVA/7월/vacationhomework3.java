//1부터 20까지의 정수 중에서 2또는 3의 배수가 아닌 수의 총합을 구하시오
class vacationhomework3 {
	public static void main(String[] args) {
		int sum=0;
		for (int n=1;n<=20 ;n++ )
		{
			if (n%2==0)continue;
			if (n%3==0)continue;
		sum+=n;
		}
		System.out.println("1부터 20까지의 정수중에서 2또는 3의 배수가 아닌 수의 총합:"+sum);
	}
}
