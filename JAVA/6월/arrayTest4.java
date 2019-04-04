//키보드로부터 10개의 정수를 입력받아 배열에 저장하고
//이중에서 3의 배수인수만 골라 출력
import java.util.*;
class  arrayTest4{
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int n[]=new int[10];
	for (int i=0;i<=n.length ;i++ )
	{
		 n[i]=sc.nextInt();
      
	   if (n[i]%3==0)
	   {

		   System.out.println(n[i]);
	   }
	}

		
	}
}
