class Stu_Test1 
{
	public static void main(String[] args) 
	{
		Student1 s1=new Student1();
		s1.name="박소원";
		s1.grade=1;
		s1.subject="java";
		

		System.out.println(s1.name+"\n"+s1.grade+"학년\n"+s1.subject);

		s1.study("도서관",s1.subject);
		s1.play("친구들"); 
	}
}
