//10개의 데이터를 입력받아서 최대값 구하기.
import java.util.*;

class ArrayList_Test2{
	public static void main(String ar[]){
	Scanner sc=new Scanner(System.in);
	int a,max=0;
	ArrayList<Integer>list2= new ArrayList<Integer>();
	for (int i=0;i<10 ;i++ )
	{
		System.out.print(i+1+"번째 데이터를 입력해 주세요:");
		list2.add(a=sc.nextInt());
		if (max<=list2.get(i))
		{
			max=list2.get(i);
		}

	
	}


	System.out.println("최대값 : "+max);
	
	
	}

}