class Employee 
{

	private String name,hiredate;
	private int salary;

	public Employee(String name, int salary, String hiredate )
		{
		this. name=name;
		this. salary=salary;
		this. hiredate=hiredate;
		}

	public Employee(String name, String hiredate)
		{
		this. name=name;
		this. hiredate=hiredate;
	
		}

	public Employee(int salary, String hiredate)
		{
		this. salary=salary;
		this. hiredate=hiredate;
		}

	public Employee(String name, int salary)
		{
		this.name=name;
		this.salary=salary;
	    }

	public void setHiredate(String a)
		{
		this. hiredate=a;
		}

	public int getSalary()
		{
		return salary;
		}

	public static void main(String[] args) 
	{
		Employee e1= new Employee("Mike",100,"2018-03-01");
		Employee e2= new Employee("Alice","2017-03-21");
		Employee e3= new Employee(300,"2016-05-03");
		Employee e4= new Employee("Tomas",500);

		System.out.println("이름:"+e1.name+" 월급:"+e1.salary+" 입사년도:"+e1.hiredate);
		e1.setHiredate("2018-03-01");
		System.out.println(e1.getSalary()+"만원");
	}
}
