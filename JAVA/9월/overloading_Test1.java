class overloading_Test1 
{
  public void add(int x,int y){
	double i;
	int sum=0;
	int big,small;

	if (x%2==0)System.out.println(x+"�� ¦��");
	else System.out.println(x+"�� Ȧ��");

	if (y%2==0)System.out.println(y+"�� ¦��");
	else System.out.println(y+"Ȧ��");
	
	i=(x+y)/2;
	if (i<0)i=-i;
	System.out.println("���밪��"+i+"�Դϴ�");

	if (x<0)System.out.println(x+"�� �����Դϴ�");
	else System.out.println(x+"�� ����Դϴ�");

	if (y<0)System.out.println(y+"�� �����Դϴ�");
	else System.out.println(y+"�� ����Դϴ�");

	if (x>y)
	{big=x;
	small=y;
	}
	else small=x; big=y;
	for (;small<=big ;small++ )
	{
		sum+=small;
	}
System.out.println(x+"��"+y+"���̼��� ����"+sum+"�Դϴ�");





  }








	public static void main(String[] args) 
	{
		overloading_Test1 t=new overloading_Test1();
		t.add(2,5);
		//t.add(3.5,2.8,9.2);
		//System.out.println(t.add("java","c"));
		//t.add(3,5,"cool");
	}
}
