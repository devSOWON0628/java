//21.100������ �ڿ��� n�� �Է¹ް� n���� ������ �Է¹޾� �����
 import java.util.*;
class so8{
public static void main(String ar[]){
Scanner sc = new Scanner(System.in);
System.out.println("100������ �ڿ����Է�");
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
	System.out.println("100������ ������ �Է��� �ּ���");
}
}

	
}

