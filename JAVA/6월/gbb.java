/*���������� (gawibawibo) ¥��
ö��, ���� �Է�, ��
*/
import java.util.*;
class gbb{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("�ҿ�:");
		String c=sc.next();
		System.out.print("���:");
		String y=sc.next();


	System.out.println("���");
	System.out.println("�ҿ�:"+c);
	System.out.println("���:"+y);

	if (c.equals(y))
	{
		System.out.println("�����ϴ�");
	}
	String result="";
	if (c.equals("����"))
	{
		switch (y)
		{
		case "����":result="�ҿ��̰� ������� �����ϴ�."; break;
		case "��":result="�ҿ��� ����� �̰���ϴ�."; break;
		default: System.out.println("�߸��Է��ϼ̽��ϴ�");
		
		}
	}
	else{
	switch (y)
	{
	case "����":result="�ҿ��̰� ����� �̰���ϴ�."; break;
	case "��":result="�ҿ��̰� ������� �����ϴ�."; break;
	default: System.out.println("�߸��Է��ϼ̽��ϴ�");
	
	}}
	System.out.println(result);
	}}

	
