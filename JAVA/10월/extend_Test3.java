class Person10
{
	String name;
	String addr;
	String tel;

	public void setName(String _name){
		name=_name;
	}
	public void setAddr(String _addr){
		addr=_addr;
	}
	public void setTel(String _tel){
		tel=_tel;
	}
	public String getName(){
		return name;
	}
	public String getAddr(){
		return addr;
	}
	public String getTel(){
		return tel;
	}
}

class Customer extends Person10
{
	String customNum;
	int mileage;
	public Customer(String _name, String _addr, String _tel, String _customNum, int _mileage){
	this.name=_name;
	this.addr=_addr;
	this.tel=_tel;
	this.customNum=_customNum;
	this.mileage=_mileage;
	}

}
public class extend_Test3
{
	public static void main(String ar[]){
	
	Customer c1 = new Customer("Tom", "101-412", "#82-622-8909", "10249304", 100);
	
	}
}
