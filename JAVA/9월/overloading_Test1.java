class overloading_Test1 
{
  public void add(int x,int y){
	double i;
	int sum=0;
	int big,small;

	if (x%2==0)System.out.println(x+"는 짝수");
	else System.out.println(x+"는 홀수");

	if (y%2==0)System.out.println(y+"는 짝수");
	else System.out.println(y+"홀수");
	
	i=(x+y)/2;
	if (i<0)i=-i;
	System.out.println("절대값은"+i+"입니다");

	if (x<0)System.out.println(x+"는 음수입니다");
	else System.out.println(x+"는 양수입니다");

	if (y<0)System.out.println(y+"는 음수입니다");
	else System.out.println(y+"는 양수입니다");

	if (x>y)
	{big=x;
	small=y;
	}
	else small=x; big=y;
	for (;small<=big ;small++ )
	{
		sum+=small;
	}
System.out.println(x+"와"+y+"사이수의 합은"+sum+"입니다");





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
