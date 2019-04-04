import java.util.*;
class scTest4{
public static void main(String ar[]){
Scanner sc = new Scanner(System.in);

int n= sc.nextInt();

if (n<=10)
{
	for (int i=0;i<n;i++)
	{
	System.out.println("Freeze");
	}
}
else {
	System.out.println("10이하의 정수를 입력하세요");
	}
}
}
