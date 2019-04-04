//22. 10개의 정수를 입력받아 입력받은 수들 중 짝수의 갯수와홀수의 갯수를 각각 구하여 출력
import java.util.*;
class so9 {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
			int a;//입력받는 수들
			int sum1=0;
			int sum2=0;

			for (int i=1 ;10>=i ;i++ ){
				a= sc.nextInt();
				if (a%2==0){
					sum1++;
			        }

					else{
						sum2++;}
			}
			System.out.println("짝수의 개수:"+sum1+"홀수의 개수:"+sum2);
			
	}
}
