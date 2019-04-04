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
		System.out.println("1. 가정용(liter당 50원)");
		System.out.println("2. 상업용(liter당 40원)");
		System.out.println("3. 공업용(liter당 30원)");
		System.out.println("______________________________________");
		System.out.print("메뉴를 선택하세요 =>");
		System.out.println("______________________________________");
		choice=sc.nextInt();
		System.out.println("사용량을 입력하세요(liter)");
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
		System.out.println("사용자 코드 :");
		
	}
}