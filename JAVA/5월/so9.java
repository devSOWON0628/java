//22. 10���� ������ �Է¹޾� �Է¹��� ���� �� ¦���� ������Ȧ���� ������ ���� ���Ͽ� ���
import java.util.*;
class so9 {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
			int a;//�Է¹޴� ����
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
			System.out.println("¦���� ����:"+sum1+"Ȧ���� ����:"+sum2);
			
	}
}
