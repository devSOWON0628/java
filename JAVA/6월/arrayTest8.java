//5키보드에서 10개의double을 입력받아 평균출력
import java.util.*;
class arrayTest8{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		double sum=0;
		int i;
		double d[]=new double[10];
		for (i=0;i<d.length ;i++ )
		{
			d[i]=sc.nextDouble();
			sum+=d[i];
		}
		System.out.println("10개의 평균"+(double)(sum/i));
	}
}
