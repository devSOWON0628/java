//���ٿ���� ��ȸ���� 
import java.util.*;
class random{
public static void main(String ar[]){
Random r=new Random();
Scanner sc=new Scanner(System.in);
String answer="";
do{
int no=r.nextInt(100);}
System.out.println("1���� 100������ ������ �Է����ּ��� ��ȸ�� 10��");
for(int count=1;count<=10;count++){
	int i=sc.nextInt();
 if(i==no){
	System.out.println("�����Դϴ�");
	
	break;
	      }
 else{
	if(i<no){
	System.out.println("up");
	        }
	else{
		System.out.println("down");
		}
     }
	 if (count==10)
	     {
		 System.out.println("game over");
	     }
}
System.out.println("�ٽ��Ͻðڽ��ϱ�? y/n");
answer=sc.next();
}while(answer.equals("y"));
System.out.println("������ �������ϴ�");


}
}