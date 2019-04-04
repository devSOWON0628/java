import java.util.*;
class Account { 
private String account_No="12345678"; //계좌번호
private String password="1234"; //비밀번호
private String owner ="박소원"; //예금주
private int balance=30000; //잔고
//public void setPasswd(String x){
	/*if (x.equals("1234"))
	{
		return "예금주명을 입력해주세요";
	}
	else return "비밀번호가 틀렸습니다";		



	}

public void deposit()//입금
	{





	}	

public void widthDraw()//출금
	{





	} 

*/
	
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
	
	Account a=new Account();
	String password;
	System.out.println("계좌번호를 입력해주세요");
	do {
	String gae=sc.next();
	
	if (gae.equals(a.accout_No1))
	{
		System.out.println("비밀번호를 입력해 주세요");
		break;
	}

	else System.out.println("계좌번호가 틀렸습니다 다시 입력해주세요");

	}while(true);





	}
}

