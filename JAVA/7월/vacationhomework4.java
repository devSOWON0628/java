//1+(1+2)+(1+2+3)+(1+2+3+4)...(1+2+3+..10)의 결과를 계산하시오
class vacationhomework4 {
	public static void main(String[] args) {
		int sum=0;
		for (int n=1;n<=10 ;n++)
		{
			sum+=n;
		}
		System.out.println(sum);
	}
}
