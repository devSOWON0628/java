import java.util.*;

class overloading_Test2  
{
	public void pandan()
		{
		int x=4;
		if (x%2==0)System.out.println(x+"�� ¦��");
	else System.out.println(x+"�� Ȧ��");

		}

	public void pandan2(int x)
	{

	if (x%2==0)System.out.println(x+"�� ¦��");
	else System.out.println(x+"�� Ȧ��");

	}	

	public String pandan3()
	{
	int x=4;

	if (x%2==0)return(x+"�� ¦��");
	else return(x+"�� Ȧ��");
	
	
	}

	public String pandan4(int x)
	{

	if (x%2==0)return(x+"�� ¦��");
	else return(x+"�� Ȧ��");
	
	
	}


	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		overloading_Test2 t2= new overloading_Test2();

		t2.pandan();
		t2.pandan2(4);
		System.out.println(t2.pandan3());
		System.out.println(t2.pandan4(4));
		
		
	}
}
