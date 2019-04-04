import java.util.*;
class numbertower2 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("정수 하나 입력");
		int n=sc.nextInt();
		for (int a=1;a<=n ;a++ ){
			for (int b=a;b<=a+3 ;b++ ){
				System.out.print(b);
			      }
               System.out.println();
		}
	}
}
