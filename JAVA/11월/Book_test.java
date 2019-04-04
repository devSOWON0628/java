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

	public String toString(){return "제목:"+title+" 페이지수:"+page+" 저자이름:"+writer;}
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

	public String toString(){return super.toString()+" 발매일자:"+date;}
}
class Book_test
{
	public static void main(String ar[])
	{
	magazine m=new magazine("소원이의 일기",150,"박소원","2018년6월28일"); 
	System.out.println(m.toString());
	}
}
