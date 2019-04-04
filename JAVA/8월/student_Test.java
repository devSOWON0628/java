class student_Test 
{
	public static void main(String[] args) 
	{
		student s1=new student();
		s1.name="김현우";
		s1.idnum=1;
		s1.add="서울";
		s1.call="0101112222";

		System.out.println(s1.name);
		System.out.println(s1.idnum);
		System.out.println(s1.add);
		System.out.println(s1.call);

		System.out.println("이름은 "+s1.name+"이고 "+s1.idnum+"학년이고 "+s1.add+"에 살고 전화번호는 "+s1.call+"입니다");
	}
}
