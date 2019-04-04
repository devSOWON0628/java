//이름, 나이를 입력받아 5번출력
import java.util.*;
class trash9 {
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("이름을 입력해 주세요");
	String name=sc.next();
	System.out.println("나이를 입력해 주세요");
	int age =sc.nextInt();
	int i=1;
	do
	{
		System.out.println("이름:"+name+"  나이:"+age);
		i++;
	}
	while (i<=5);

	}
}
