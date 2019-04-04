import java.util.*;
class whTest3 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("정수 n을 입력받고 1부터 n까지 짝수의 합을 구하시오");
		System.out.println("정수 n 입력");

		int n=sc.nextInt();
		int a=1;
		int t=0;
		while (a<=n)
		{
			if (a%2==0)
			{
				t+=a;
				
				
			}
			a++;
		}System.out.println(t);
	}
}
