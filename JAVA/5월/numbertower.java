import java.util.*;
class  numbertower{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("정수입력해 잉간아");
		int sum = sc.nextInt();
		for (int a=1;a<=sum ;a++ )
		{
			for (int i=1;i<=a ;i++ )
			{
				System.out.print(i);
			}
			System.out.println();
		}
	}
}
