class Employee 
{
	String name;
	int num;

	void setName(String name){this.name=name;}
	String getName(){return name;}

	void setNum(int num){this.num=num;}
	int getNum(){return num;}

	public String toString()
		{
		return "이름:"+name+" 번호:"+num;
	
		}

	Employee(String name, int num)
	{
	this.name=name;
	this.num=num;
	}

}

class SalariedEmployee extends Employee
{
	static double salary;
	SalariedEmployee(String name, int num,double salary )
	{
		super(name,num);
		this.salary=salary;
	}


	void setSalary(double salary){this.salary=salary;}
	double getSalary(){return salary;}
	 static double computeSalary(double salary){
		double salary1=salary*12;
		System.out.println("aa"+salary1);
	return salary1;
	}
	public String toString(){
		
	return (super.toString()+" 월급: "+SalariedEmployee.computeSalary(salary));
	}
}

class super_Test2
{
	public static void main(String ar[])
	{
	Employee e1= new Employee("sam",1);
	SalariedEmployee e2= new SalariedEmployee("tom",2,20);
	System.out.println(e2.toString());
	
	}
}