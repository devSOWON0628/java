//두 개의 정수를 입력받아 두 개 정수 사이에서 3의 배수이거나 5의 배수인 수들의 합과 평균을 출력
import java.util.*;
class home_Test {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int sum1 =0;//합
		int sum2 =0;//배수
		int i=0;//나눠주는수
		if (num1<num2)
		{
			for (int a=num1;a<=num2 ;a++ )
			{
				i++;
					if (a%3==0&&a%5==0)
					{
					sum1+=a;
					sum2=sum1/i;
					}
			}
		
		}
		else {
			for (int a=num2;a<=num1 ;a++ )
			{
				i++;
					if (a%3==0&&a%5==0)
					{
					sum1+=a;
					sum2=sum1/i;
					}
					
			}

	}
	System.out.println("3의 배수이거나 5의 배수인 수의 합:"+sum1);
	    System.out.println("3의 배수이거나 5의 배수인 수의 평균:"+sum2);
}
}
