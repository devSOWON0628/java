import java.util.*;
class Product 
{
	private String id,info,maker, price;//컨슈머 생산자.
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
	System.out.println("정보:"+getInfo());
	System.out.println("생산자:"+getMaker());
	System.out.println("가격:"+getPrice());
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
System.out.println("책 제목:"+title);
System.out.println("책 저자:"+author);
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
	System.out.println("타이틀 송:"+titlesong);
	System.out.println("가수:"+singer);
	
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
	System.out.println("유닛:"+unit);
	System.out.println("주제:"+topic);
	System.out.println("선생님:"+teacher);
	
	}

}

class Test1127
{
	public static void main(String ar[])
	{
	Scanner sc=new Scanner(System.in);
	Product p[]=new Product[10];
	String id, info, maker, price, title, author, isbn, titlesong, singer,unit, topic, teacher;
	int count=0;//삽입할 상품 개수
	int choice,nextchoice;
	while(true){
		
		System.out.println("==상품추가<1>, 상품조회<2>, 끝내기<3>>>==1");
		choice=sc.nextInt();
		
		if (choice==1)
		{
			System.out.println("작품종류 책<1>, 음악<2>, 회화<3>");
			nextchoice=sc.nextInt();
			switch (nextchoice)
			{
			case 1: 
				System.out.print("상품 ID>>");
				id=sc.next();
				System.out.print("상품 설명>>");
				info=sc.next();
				System.out.print("생산자>>");
				maker=sc.next();
				System.out.print("가격>>");
				price=sc.next();
				System.out.print("책 제목>>");
				title=sc.next();
				System.out.print("저자>>");
				author=sc.next();
				System.out.print("ISBN>>");
				isbn=sc.next(); 
				p[count]=new Book(id, info, maker, price, title, author, isbn);
				count++;
				break;

			case 2: 
				System.out.print("상품 ID>>");
				id=sc.next();
				System.out.print("상품 설명>>");
				info=sc.next();
				System.out.print("생산자>>");
				maker=sc.next();
				System.out.print("가격>>");
				price=sc.next();
				System.out.print("메인타이틀>>");
				titlesong=sc.next();
				System.out.print("가수>>");
				singer=sc.next(); 
				p[count]=new music_1204(id, info, maker, price, titlesong, singer);
				count++;
				break;

				case 3: 
				System.out.print("상품 ID>>");
				id=sc.next();
				System.out.print("상품 설명>>");
				info=sc.next();
				System.out.print("생산자>>");
				maker=sc.next();
				System.out.print("가격>>");
				price=sc.next();
				System.out.print("유닛>>");
				unit=sc.next();
				System.out.print("주제>>");
				topic=sc.next();
				System.out.print("선생님>>");
				teacher=sc.next(); 
				p[count]=new Book(id, info, maker, price,unit, topic, teacher);
				count++;
				break;
			
			}
		
		

			}

			else if(choice==2)
			{
				if(count==0){
					System.out.println("입력부터 하십시오~ 입력은 상품추가에서 할 수 있답니다");
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