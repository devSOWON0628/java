import java.util.*;
class  sowon2{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num1,num2,a;
		num1=sc.nextInt();
		num2=sc.nextInt();
		a=num1;
		int i=0;
		while(a<=num2){
		if (a%5==0)
		{
			i++;
		}
		a++;
		}
		System.out.println("5의 배수인 수들의 개수"+i);
	}
}
