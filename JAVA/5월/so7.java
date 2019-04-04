//정수를 입력받아서 별 출력
import java.util.*;
class so7 {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		for (int a=num; 1<=a; a-- )
		{
			for (int b=1;b<=a;b++ )
			{
				System.out.print("*");
			}
			System.out.println("");
		}
	}
}
