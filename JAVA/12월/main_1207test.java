import java.util.*;
abstract class main
{
	private int liter;
	abstract public int used(){};
}
class fam extends main
{
	private int liter;
	void setLiter(int liter)
	{
		this.liter=liter;
	}

	int getLiter()
	{
		return liter;
	}

	public int used()
	{
	return getLiter()*50;
	}
}

class com extends main
{
	private int liter;
	void setLiter(int liter)
	{
		this.liter=liter;
	}

	int getLiter()
	{
		return liter;
	}
	public int used()
	{
	return getLiter()*40;
	}
}

class fac extends main
{
	private int liter;
	void setLiter(int liter)
	{
		this.liter=liter;
	}

	int getLiter()
	{
		return liter;
	}
	public int used()
	{
	return getLiter()*30;
	}
}

class main_1207test
{
	public static void main(String ar[])
	{
		Scanner sc=new Scanner(System.in);
		int choice,liter,count=0;
		main m[]=new main[10];
		System.out.println("1. ������(liter�� 50��)");
		System.out.println("2. �����(liter�� 40��)");
		System.out.println("3. ������(liter�� 30��)");
		System.out.println("______________________________________");
		System.out.print("�޴��� �����ϼ��� =>");
		System.out.println("______________________________________");
		choice=sc.nextInt();
		System.out.println("��뷮�� �Է��ϼ���(liter)");
		System.out.println("______________________________________");
		liter=sc.nextLiter();
		if (choice==1)
		{
			m[count]=new home(liter);
			count++;
		}
		else if(choice==2)
		{
			m[count]=new com(liter);
			count++;
		}
		else if(choice==3)
		{
			m[count]=new fac(liter);
			count++;
		}

		System.out.println("_____________________________________");
		System.out.println("����� �ڵ� :");
		
	}
}