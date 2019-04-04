//두개의 주사위를 던졌을 때 눈의 합이 입력받은 수가되는 모든 경우의 수를 출력하는 프로그램 작성
import java.util.*;
class vacationhomework6 {
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.print("원하는 정수를 입력해주세요:");
	int count=0,num=sc.nextInt();
		for (int i=1;i<=6;i++ )
		{
			for (int j=1;j<=6 ;j++ )
			{
				if(i+j==num)count++;
			}
		}
	System.out.println("눈의 합이"+num+"이되는 모든 경우의 수는"+count+"입니다.");
	}
}
