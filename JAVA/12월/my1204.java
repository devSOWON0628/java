import java.util.*;
class Human 
{
	int hometown;
	String hobby;
	String favorite;
	String idol;
	
	String hometime(int x)
	{
		return "������ ���� �ð���"+(hometown+x)+"�Դϴ�";
	}

	String idol(String s)
	{
	if (s.equals("f"))
		{
			return "�����ϴ� ���̵��� ���ھ��̵�";
		}

	else if (s.equals("m"))
		{
			return "�����ϴ� ���̵��� ���� ���̵�";
		}

	}

	
}

class Student
{
	int cjpoint=1000;
	String use(int p)
	{
		if(cjpoint<p)return "����� ����Ʈ �ڼҿ��� �������ϴ�";
		else return "����� ����Ʈ�� ������!";
	
	}
}

class my1204
{
	public static void main(String ar[])
	{
		int choice;
		int hometown;
		String hobby;
		String favorite;
		String idol;
		int x;
		String s;
		int p;
		int count=0;
		Scanner sc=new Scanner(System.in);
		Human h[]=new Human[10];
		while(true){
		System.out.print("�����ΰ��±�,���̵� >>1, ����� cj����Ʈ>>2, ������>>3");
		choice=sc.nextInt();
		if (choice==1)
				{
				System.out.println("����� ���� �б��κ��� ��Ű�ι��� ������ �ֽ��ϳ�");
				hometown=sc.nextInt();
				System.out.println("������ ���� ������ �̿��� ���ΰ���? 1.���� 2. ����ö 3. ����");
				int i=sc.nextInt();
				System.out.println("����� �����ϴ� ���̵��� �����Դϱ� �����Դϱ��?");
				s=sc.next();
				count++;
				h[count]=new Human(i,s);
			}
				
				}
		else if(choice==2)
				{
				System.out.println("����� ������ �ִ� CJ����Ʈ�� �����Դϱ�?");
				x=sc.nextInt();
				count++;
				h[count]=new Student(x);
				}

			}
		
			
		}
		
	
	}
}
