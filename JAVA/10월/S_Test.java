class Student5 
{
	private String name;
	private String grade;
	

	public void setName(String n)
		{
	     name=n;
	
		}

	public String getName()
		{
		return name;
	
	
		}


	public void setGrade(String n)
		{
		grade=n;
	
		}

	public String getGrade()
	   {
	
	    return grade;
	
		}
}


class S_Test{
		public static void main(String[] args) 
		{
			Student5 s1=new Student5();
			s1.setName("Tom");
			System.out.println(s1.getName());
			s1.setGrade("1");
			System.out.println(s1.getGrade());
		}
	}
