//5���̿���,,

class Student11
{
	

	public static void main(String[] args) 
	{
		Student11 s=new Student11();
		s.name="ȫ�浿";
		s.ban=1;
		s.no=1;
		s.kor=100;
		s.eng=60;
		s.math=76;

		System.out.println("�̸�:"+s.name);
		System.out.println("����:"+s.getTotal());
		System.out.println("���:"+s.getAverage());
		
	}
	private String name;//�л��̸�
	int ban,no,kor,eng,math;//��,��ȣ,��������,��������,��������
	
	public int getTotal(){
	
	return kor+eng+math;
	
	
	}

	public float getAverage(){
	
	return (kor+eng+math)/3;
	
	}
}
