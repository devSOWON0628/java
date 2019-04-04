import java.util.*;
class Product 
{
	private String id,info,maker, price;//������ ������.
	Product(String id, String info, String maker, String price)
		{
		this.id=id;
		this.info=info;
		this.maker=maker;
		this.price=price;
		}

	void setId(String id)
		{
		this.id=id;
		}

	String getId()
		{
		return id;
		}

	void setInfo(String info)
		{
		this.info=info;
		}

	String getInfo()
		{
		return info;
		}

	void setMaker(String maker)
		{
		this.maker=maker;
		}

	String getMaker()
		{
		return maker;
		}

	void setPrice(String price)
		{
		this.price=price;
		}

	String getPrice()
		{
		return price;
		}

	void show(){
	System.out.println("id:"+getId());
	System.out.println("����:"+getInfo());
	System.out.println("������:"+getMaker());
	System.out.println("����:"+getPrice());
	}
}

class Book extends Product{
private String title, author, isbn;
	void setTitle(String title)
		{
		this.title=title;
		}

	String getTitle()
		{
		return title;
		}

	void setAuthor(String author)
		{
		this.author=author;
		}

	String getAuthor()
		{
		return author;
		}
	void setIsbn(String isbn)
		{
		this.isbn=isbn;
		}

	String getIsbn()
		{
		return isbn;
		}

Book(String id, String info,String maker, String price, String title, String author, String isbn)
	{
	super(id, info, maker, price);
	this.title=title;
	this.author=author;
	this.isbn=isbn;
	}

void show(){
System.out.println("");
super.show();
System.out.println("å ����:"+title);
System.out.println("å ����:"+author);
System.out.println("isbn:"+isbn);

}


}
class music_1204 extends Product 
{
	private String titlesong, singer;
	music_1204(String id, String info, String maker, String price,String titlesong, String singer)
		{
		super(id, info,maker, price);
		this.titlesong=titlesong;
		this.singer=singer;
		}

	void setTitlesong(String Titlesong)
	{
	this.titlesong=Titlesong;
	}

	String getTitlesong()
	{
		return titlesong;
	}

	void setSinger(String singer)
	{
	this.singer=singer;
	}

	String getSinger()
	{
		return singer;
	}

	void show()
	{
	System.out.println("");
	super.show();
	System.out.println("Ÿ��Ʋ ��:"+titlesong);
	System.out.println("����:"+singer);
	
	}

}
class conversation extends Product
{
	private String unit, topic, teacher;
	void setUnit(String unit)
	{
	this.unit=unit;
	}

	String getUnit()
	{
		return unit;
	}

	void setTopic(String topic)
	{
	this.topic=topic;
	}

	String getTopic()
	{
		return topic;
	}

	void setTeacher(String teacher)
	{
	this.teacher=teacher;
	}

	String getTeacher()
	{
		return teacher;
	}

	conversation(String unit, String topic, String teacher,String id, String info, String maker, String price)
	{
		super(id,info,maker,price);
		this.unit=unit;
		this.topic=topic;
		this.teacher=teacher;
	
	}
	void show()
	{
	System.out.println("");
	super.show();
	System.out.println("����:"+unit);
	System.out.println("����:"+topic);
	System.out.println("������:"+teacher);
	
	}

}

class Test1127
{
	public static void main(String ar[])
	{
	Scanner sc=new Scanner(System.in);
	Product p[]=new Product[10];
	String id, info, maker, price, title, author, isbn, titlesong, singer,unit, topic, teacher;
	int count=0;//������ ��ǰ ����
	int choice,nextchoice;
	while(true){
		
		System.out.println("==��ǰ�߰�<1>, ��ǰ��ȸ<2>, ������<3>>>==1");
		choice=sc.nextInt();
		
		if (choice==1)
		{
			System.out.println("��ǰ���� å<1>, ����<2>, ȸȭ<3>");
			nextchoice=sc.nextInt();
			switch (nextchoice)
			{
			case 1: 
				System.out.print("��ǰ ID>>");
				id=sc.next();
				System.out.print("��ǰ ����>>");
				info=sc.next();
				System.out.print("������>>");
				maker=sc.next();
				System.out.print("����>>");
				price=sc.next();
				System.out.print("å ����>>");
				title=sc.next();
				System.out.print("����>>");
				author=sc.next();
				System.out.print("ISBN>>");
				isbn=sc.next(); 
				p[count]=new Book(id, info, maker, price, title, author, isbn);
				count++;
				break;

			case 2: 
				System.out.print("��ǰ ID>>");
				id=sc.next();
				System.out.print("��ǰ ����>>");
				info=sc.next();
				System.out.print("������>>");
				maker=sc.next();
				System.out.print("����>>");
				price=sc.next();
				System.out.print("����Ÿ��Ʋ>>");
				titlesong=sc.next();
				System.out.print("����>>");
				singer=sc.next(); 
				p[count]=new music_1204(id, info, maker, price, titlesong, singer);
				count++;
				break;

				case 3: 
				System.out.print("��ǰ ID>>");
				id=sc.next();
				System.out.print("��ǰ ����>>");
				info=sc.next();
				System.out.print("������>>");
				maker=sc.next();
				System.out.print("����>>");
				price=sc.next();
				System.out.print("����>>");
				unit=sc.next();
				System.out.print("����>>");
				topic=sc.next();
				System.out.print("������>>");
				teacher=sc.next(); 
				p[count]=new Book(id, info, maker, price,unit, topic, teacher);
				count++;
				break;
			
			}
		
		

			}

			else if(choice==2)
			{
				if(count==0){
					System.out.println("�Էº��� �Ͻʽÿ�~ �Է��� ��ǰ�߰����� �� �� �ִ�ϴ�");
					System.out.println("");
					continue;
					}

				for(int i=0;i<count;i++)
				{
				p[i].show();
				System.out.println("");
				}
			
		}
		else if(choice ==3)System.exit(0);


		
		}
	}
}