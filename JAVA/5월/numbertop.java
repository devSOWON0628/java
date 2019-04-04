import java.util.*;
class numbertop{//n을 입력받아 숫자출력 
	public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	System.out.println("정수 하나 입력");
	int n=sc.nextInt();
	for (int i=n;i>=1 ;i-- ){
		for (int j=n;j>=i;j--){
		System.out.print(j+" ");
		

		}
		System.out.println();
	}
		
	}
}
