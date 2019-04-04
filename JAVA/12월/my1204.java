import java.util.*;
class Human 
{
	int hometown;
	String hobby;
	String favorite;
	String idol;
	
	String hometime(int x)
	{
		return "집으로 가는 시간은"+(hometown+x)+"입니다";
	}

	String idol(String s)
	{
	if (s.equals("f"))
		{
			return "좋아하는 아이돌은 여자아이돌";
		}

	else if (s.equals("m"))
		{
			return "좋아하는 아이돌은 남자 아이돌";
		}

	}

	
}

class Student
{
	int cjpoint=1000;
	String use(int p)
	{
		if(cjpoint<p)return "당신의 포인트 박소원이 가져갑니당";
		else return "당신은 포인트가 적군요!";
	
	}
}

class my1204
{
	public static void main(String ar[])
	{
		int choice;
		int hometown;
		String hobby;
		String favorite;
		String idol;
		int x;
		String s;
		int p;
		int count=0;
		Scanner sc=new Scanner(System.in);
		Human h[]=new Human[10];
		while(true){
		System.out.print("집으로가는길,아이돌 >>1, 당신의 cj포인트>>2, 끝내기>>3");
		choice=sc.nextInt();
		if (choice==1)
				{
				System.out.println("당신의 집은 학교로부터 몇키로미터 떨어져 있습니끼");
				hometown=sc.nextInt();
				System.out.println("집으로 갈땐 무엇을 이용할 것인가요? 1.버스 2. 지하철 3. 기차");
				int i=sc.nextInt();
				System.out.println("당신이 좋아하는 아이돌은 남자입니까 여자입니까악?");
				s=sc.next();
				count++;
				h[count]=new Human(i,s);
			}
				
				}
		else if(choice==2)
				{
				System.out.println("당신이 가지고 있는 CJ포인트는 몇점입니까?");
				x=sc.nextInt();
				count++;
				h[count]=new Student(x);
				}

			}
		
			
		}
		
	
	}
}
