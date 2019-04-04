//	회사에 근무하는 직원들을 나타내는 클래스들을 상속을 이용하여 작성	*/
class Employee
{
	String name;
	String num;
	
	void setName(String _name){
	this.name=_name;
	}

	String getName(){
		return name;
	}

	void setNum(String _num){
	this.num=_num;
	}

	String getNum(){
	return num;
	}

	void computeSalary(){
	100*12;
	
	}
}
class SalariedEmployee extends Employee
{
	double salary;
	public void setSalary(double _salary){
		this.salary=_salary;
	}
	public double getSalary(){
		return salary;
	}
	public void computeSalary(){
		12*salary;
	}

}
public class extend_Test5 {
	public static void main(String[] args) {
		Employee e01 = new Employee("Sam", "01");
		SalariedEmployee e02 = new SalariedEmployee("Bob", "02");
		
	}
}
