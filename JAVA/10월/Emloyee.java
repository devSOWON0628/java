class Emloyee
{
	String name;
	String num;//사원번호
	
	void setName(String _name){
	this.name=_name;
	}

	String getName(){
	return this.name;
	}

	void setNum(String _num){
	this.num=_num;
	}

	String getNum(){
	return this.num;
	}
	
	void computerSalary(){System.out.println(100*12+"개월");}
}