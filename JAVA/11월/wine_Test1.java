class wine 
{
	private String manufacture, name, country, region,kind;
	private int year, grade;

	wine(String manufacture, String name, String country, String region, String kind, int year, int grade)
	{
		this.manufacture=manufacture;
		this.name=name;
		this.country=country;
		this.kind=kind;
		this.region=region;
		this.year=year;
		this.grade=grade;
	}
	wine(String manufacture, String name)
	{
		this.manufacture=manufacture;
		this.name=name;
	}
	public String toString(){return "manufacture은 "+manufacture+" 이름은 "+name;}
}

class wine_Test1
{
	public static void main(String ar[])
	{
	wine w=new wine("제조하다","이름");
	System.out.println(w.toString());
	
	}
}
