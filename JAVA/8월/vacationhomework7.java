//다음은 거스름돈을 몇 개의 동전으로 지불할 수 있는지를 계산하는 문제이다 변수의 금액을 동전으로 바꿔서 출력
import java.util.*;
class vacationhomework7 {
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.print("거스름돋을 입력해 주세요:");
		int change=sc.nextInt();
		int c500=0; int c100=0; int c50=0; int c10=0;
		while (change>0){
			if (change>=500)
			{
				c500++;
				change-=500;
			}
			else if (change>=100)
			{
				c100++;
				change-=100;
			}
			else if (change>=50)
			{
				c50++;
				change-=50;
			}
			else if (change>=10)
			{
				c10++;
				change-=10;
			}
								}
		System.out.println("500원:"+c500+"개 100원:"+c100+"개 50원:"+c50+"개 10원:"+c10+"개");

		
	}
}
