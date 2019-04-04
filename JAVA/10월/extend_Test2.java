class extend_Test2 
{
	public static void main(String[] args) 
	{
		rabbit r=new  rabbit(4," white"," jack");
		tiger t=new tiger(4," pink"," sowon");
		System.out.println(r.leg+r.color+r.owner);
		System.out.println(r.run());
		System.out.println(t.leg+t.color+t.owner);
		System.out.println(t.run());
		System.out.println(t.eat());
	}
}
