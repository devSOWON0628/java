


public class soso {
	public static void main(String[] args) {
		int count=0;
		System.out. println("===1���� 20 ������ �Ҽ����ϱ� ���α׷�===");
		for(int i=1;i<=20;i++) {
			for(int j=1;j<=i;j++) 
			{
				if(i%j==0) {count++;}
			}
			if(count==2) {System.out.println(i+"�� �Ҽ��Դϴ�");count=0;}
			System.out.println(i+"�� �Ҽ��� �ƴմϴ�.");count=0;
			
			
			
		}
	}

}
