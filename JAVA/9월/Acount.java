import java.util.*;
class Account { 
private String account_No="12345678"; //���¹�ȣ
private String password="1234"; //��й�ȣ
private String owner ="�ڼҿ�"; //������
private int balance=30000; //�ܰ�
//public void setPasswd(String x){
	/*if (x.equals("1234"))
	{
		return "�����ָ��� �Է����ּ���";
	}
	else return "��й�ȣ�� Ʋ�Ƚ��ϴ�";		



	}

public void deposit()//�Ա�
	{





	}	

public void widthDraw()//���
	{





	} 

*/
	
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
	
	Account a=new Account();
	String password;
	System.out.println("���¹�ȣ�� �Է����ּ���");
	do {
	String gae=sc.next();
	
	if (gae.equals(a.accout_No1))
	{
		System.out.println("��й�ȣ�� �Է��� �ּ���");
		break;
	}

	else System.out.println("���¹�ȣ�� Ʋ�Ƚ��ϴ� �ٽ� �Է����ּ���");

	}while(true);





	}
}

