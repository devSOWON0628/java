/*가위바위보 (gawibawibo) 짜기
철수, 영희 입력, 비교
*/
import java.util.*;
class gbb{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("소원:");
		String c=sc.next();
		System.out.print("경수:");
		String y=sc.next();


	System.out.println("결과");
	System.out.println("소원:"+c);
	System.out.println("경수:"+y);

	if (c.equals(y))
	{
		System.out.println("비겼습니다");
	}
	String result="";
	if (c.equals("가위"))
	{
		switch (y)
		{
		case "바위":result="소원이가 경수에게 졌습니다."; break;
		case "보":result="소원가 경수를 이겼습니다."; break;
		default: System.out.println("잘못입력하셨습니다");
		
		}
	}
	else{
	switch (y)
	{
	case "바위":result="소원이가 경수를 이겼습니다."; break;
	case "보":result="소원이가 경수에게 졌습니다."; break;
	default: System.out.println("잘못입력하셨습니다");
	
	}}
	System.out.println(result);
	}}

	
