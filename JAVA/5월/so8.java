//21.100이하의 자연수 n을 입력받고 n개의 정수를 입력받아 평균을
 import java.util.*;
class so8{
public static void main(String ar[]){
Scanner sc = new Scanner(System.in);
System.out.println("100이하의 자연수입력");
int n=sc.nextInt(); int t=0;
if(n<=100){
for (int i=1;i<=n;i++)
{
	int n1= sc.nextInt();
	t=t+n1;
	}

	int av=t/n;
	System.out.println(av);
}

else{
	System.out.println("100이하의 정수를 입력해 주세요");
}
}

	
}

