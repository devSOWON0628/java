class book 
{
	String title, writer;
	int page;
	book(String title, int page, String writer)
	{
		this. title=title;
		this. page= page;
		this. writer=writer;
	}
	void setTitle(String title){this.title=title;}
	String getTitle(){return title;}
	void setPage(int page){this.page=page;}
	int getPage(){return page;}
	void setWriter(String writer){this.writer=writer;}
	String getWriter(){return writer;}

	public String toString(){return "����:"+title+" ��������:"+page+" �����̸�:"+writer;}
}
class magazine extends book
{
	String date;
	magazine(String title, int page, String writer, String date)
	{
		super(title,page,writer);
		this.date=date;
	}
	void setDate(String date){this.date=date;}
	String getDate(){return date;}

	public String toString(){return super.toString()+" �߸�����:"+date;}
}
class Book_test
{
	public static void main(String ar[])
	{
	magazine m=new magazine("�ҿ����� �ϱ�",150,"�ڼҿ�","2018��6��28��"); 
	System.out.println(m.toString());
	}
}
