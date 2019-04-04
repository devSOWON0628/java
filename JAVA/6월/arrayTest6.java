//3번사용자의 입력을 5개받아서 최대값 출력
import java.util.*;
class arrayTest6 {
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
		int i[]=new int[5];
		int sum=0;
			for (int n=0;n<i.length ; n++)
			{
			 i[n]=sc.nextInt();
		 if (sum<i[n])
			 {
				 sum=i[n];

			 }

			}
			System.out.println("가장큰수"+sum);
	}
}
