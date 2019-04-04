//13. 100이하의 자연수 n을 입력받아 1부터 n까지의 평균을 출력하는 프로그램을 작성하시오.
class problem13{
	public static void main(String[] args) {
		int sum=0,count=0;
		int n=Integer.parseInt(args[0]);
		if (n>100)System.out.println{("100이하의 자연수를 매개변수로 입력해주세요.");return 0;}
		for (int i=1;i<=n ;i++ )
		{
		sum+=i;
		count++;
		}
		System.out.println("1부터"+n+"까지의 평균"+(sum/count);
	}
}
