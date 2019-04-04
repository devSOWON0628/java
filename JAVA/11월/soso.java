


public class soso {
	public static void main(String[] args) {
		int count=0;
		System.out. println("===1부터 20 사이의 소수구하기 프로그램===");
		for(int i=1;i<=20;i++) {
			for(int j=1;j<=i;j++) 
			{
				if(i%j==0) {count++;}
			}
			if(count==2) {System.out.println(i+"은 소수입니다");count=0;}
			System.out.println(i+"은 소수가 아닙니다.");count=0;
			
			
			
		}
	}

}
