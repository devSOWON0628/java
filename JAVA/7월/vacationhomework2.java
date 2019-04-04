import java.util.*;
class vacationhomework2 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("화씨를 섭씨로 변환하는 코드입니다.");
		System.out.print("화씨온도를 입력해 주세요:");
		int temperature=sc.nextInt();
		System.out.println("화씨온도:"+((float)temperature-(float)32)/1.8);
	}
}
