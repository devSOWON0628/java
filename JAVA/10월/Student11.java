//5번이에욤,,

class Student11
{
	

	public static void main(String[] args) 
	{
		Student11 s=new Student11();
		s.name="홍길동";
		s.ban=1;
		s.no=1;
		s.kor=100;
		s.eng=60;
		s.math=76;

		System.out.println("이름:"+s.name);
		System.out.println("총점:"+s.getTotal());
		System.out.println("평균:"+s.getAverage());
		
	}
	private String name;//학생이름
	int ban,no,kor,eng,math;//반,번호,국어점수,영어점수,수학점수
	
	public int getTotal(){
	
	return kor+eng+math;
	
	
	}

	public float getAverage(){
	
	return (kor+eng+math)/3;
	
	}
}
