import java.util.*;
class VendingMachine {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int cost=0;//음료수값
		int change=0;//거스름돈
		String answer;//대답
		int count=0;//카운트
		int change1000=0;
	    int change500=0;
		int change100=0;
		int change10=0;
        int plus=0;//추가더하기금액
		int didi=0;
		
		
		
System.out.println("==========================================");
System.out.println("1.콜라(600) 2.커피(300) 3.물(500) 4.보리차(700)");
System.out.println("==========================================");
System.out.print("금액을 입력하세요:");
int money=sc.nextInt();
if (money<300)
{
	System.out.println("돈을 더 넣어주세요!");
	plus=sc.nextInt();
	money+=plus;
}
System.out.println("현재"+money+"원");
do
{
System.out.print("음료를 선택하세요:");
String drink=sc.next();
System.out.println(drink);
System.out.println(drink+"를 몇개 뽑겠습니까?");
didi=sc.nextInt();
System.out.println("===========================================");


switch(drink){
case "콜라" :cost=600*didi;
break;
case "커피":cost=300*didi;
break;
case "물":cost=500*didi;
break;
case "보리차":cost=700*didi;
break;
default :System.out.println("잘못 입력하셨습니다"); return;
}

if (count>0)
{
	change=change-cost;
}
else{
	change=money-cost;
	}
	if(change<0||money<0)
	{
	System.out.println("잔액이 부족합니다. 돈을 더 넣어주세요");
    plus=sc.nextInt();
	money+=plus;

}
if(change>0){
System.out.println("뽑으신 음료는 "+drink+"이며"+didi+"개 입니다. 거스름돈은"+ change+"원입니다.");}
System.out.println("추가 선택하시겠습니까? y/n");
answer=sc.next();
count++;
}while(answer.equals("y"));
while (change>0)
{
	if (change>=1000)
	{
		change1000++;
		change-=1000;
	}
	else if (change>=500)
	{
		change500++;
		change-=500;
	}
	else if (change>=100)
	{
		change100++;
		change-=100;
	}
	else if (change>10)
	{
		change10++;
		change-=10;
	}
}
System.out.println("1000원:"+change1000+"개 500원:"+change500+"개 100원:"+change100+"개 10원:"+change10+"개");
System.out.println("끝 바이바이~~");
		}

	}
	