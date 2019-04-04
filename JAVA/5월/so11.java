//한 개의 자연수를 입력받아 그 수의 배수를 차례로 10개 출력
import java.util.*;
class so11 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num =sc.nextInt();

		for (int a=1;10>=a ;a++ )
		{
			System.out.println(num+"*"+a+"="+num*a);
		}
		
	}
}
