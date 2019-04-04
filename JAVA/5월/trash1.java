//n을 입력받아 1~n까지4의 배수출력
import java.util.*;
class trash1 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int i=1;
			while (i<=n){
			if (i%4==0)
			{
				System.out.println(i);
			}
				i++;
			}
	}
}
