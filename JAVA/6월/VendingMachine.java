import java.util.*;
class VendingMachine {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int cost=0;//�������
		int change=0;//�Ž�����
		String answer;//���
		int count=0;//ī��Ʈ
		int change1000=0;
	    int change500=0;
		int change100=0;
		int change10=0;
        int plus=0;//�߰����ϱ�ݾ�
		int didi=0;
		
		
		
System.out.println("==========================================");
System.out.println("1.�ݶ�(600) 2.Ŀ��(300) 3.��(500) 4.������(700)");
System.out.println("==========================================");
System.out.print("�ݾ��� �Է��ϼ���:");
int money=sc.nextInt();
if (money<300)
{
	System.out.println("���� �� �־��ּ���!");
	plus=sc.nextInt();
	money+=plus;
}
System.out.println("����"+money+"��");
do
{
System.out.print("���Ḧ �����ϼ���:");
String drink=sc.next();
System.out.println(drink);
System.out.println(drink+"�� � �̰ڽ��ϱ�?");
didi=sc.nextInt();
System.out.println("===========================================");


switch(drink){
case "�ݶ�" :cost=600*didi;
break;
case "Ŀ��":cost=300*didi;
break;
case "��":cost=500*didi;
break;
case "������":cost=700*didi;
break;
default :System.out.println("�߸� �Է��ϼ̽��ϴ�"); return;
}

if (count>0)
{
	change=change-cost;
}
else{
	change=money-cost;
	}
	if(change<0||money<0)
	{
	System.out.println("�ܾ��� �����մϴ�. ���� �� �־��ּ���");
    plus=sc.nextInt();
	money+=plus;

}
if(change>0){
System.out.println("������ ����� "+drink+"�̸�"+didi+"�� �Դϴ�. �Ž�������"+ change+"���Դϴ�.");}
System.out.println("�߰� �����Ͻðڽ��ϱ�? y/n");
answer=sc.next();
count++;
}while(answer.equals("y"));
while (change>0)
{
	if (change>=1000)
	{
		change1000++;
		change-=1000;
	}
	else if (change>=500)
	{
		change500++;
		change-=500;
	}
	else if (change>=100)
	{
		change100++;
		change-=100;
	}
	else if (change>10)
	{
		change10++;
		change-=10;
	}
}
System.out.println("1000��:"+change1000+"�� 500��:"+change500+"�� 100��:"+change100+"�� 10��:"+change10+"��");
System.out.println("�� ���̹���~~");
		}

	}
	