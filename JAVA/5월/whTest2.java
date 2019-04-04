import java.util.*;
class whTest2 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("정수하나입력");
		int num=sc.nextInt();
		int i=1;
		while (i<=10)
		{
			System.out.println(num+"*"+i+"="+num*i);
			
			i++;
		}
	}
}
