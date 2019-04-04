//n을 입력받아 1~n사이에 3의 배수이면서 5의 배수인수 출력
import java.util.*;
class  trash7{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		n=sc.nextInt();
		int i=1;
		do{
			if (i%3==0&&i%5==0)
			{
				System.out.println(i);
				
				}
				i++;
		}
		while (n>=i);
	}
}
