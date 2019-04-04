//4번 5개수입력받아서 최대 최소출력
import java.util.*;
class arrayTest7{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
	System.out.println("정수 5개를 입력하고 enter을 눌러주세요.");
	int i[]=new int[5];
	int a;
	for (a=0;a<i.length ;a++ )
	{
		i[a]=sc.nextInt();
	}
	int big=0,small=i[0];
	for (a=0;a<i.length ;a++ )
	{
		if (small>i[a])
		{
          small=i[a];
		}
		if (big<i[a])
		{ 
			big=i[a];
		}
	}
System.out.println("최대:"+big+" 최소:"+small);
/* int big=0,small=36650;
     int i[]=new int[5];
	 for (int a=0 ;a<i.length;a++ )
	 {
		 i[a]=sc.nextInt();
		 if (i[a]>big)
		 {
			 big=i[a];
		 }
		 if(i[a]<small)
		 {
			 small=i[a];
		 }
	 }
	 System.out.println("최대:"+big+" 최소:"+small);*/
	}
}
