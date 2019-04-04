import java.util.*;

class ArrayList_Test1{
	public static void main(String ar[]){
		ArrayList<String> list=new ArrayList<String>();
		list.add("apple");
		list.add("mango");
		list.add("melon");
		list.add("grape");
		list.add(null);
		list.add(2,"strawberry추가추가");//3번째 방에 넣어줌 뒤에있는건 자동으로 밀린다. 원하는 위치에 데이터 삽입 가능
		System.out.println(list.get(3));//4번째 방에있는 데이터를 가져오는것
		list.remove(2);//지워즌느것
		System.out.println(list.size());
		System.out.println(list.indexOf("mango"));
		list.clear();
		//list.add(3); 타입이 String이니까 3을 넣었을때 에러가 난다.


		System.out.println(list); //[apple, mango, melon, grape, null]


		for(String fluit: list)
			{
			System.out.println(fluit);//네모괄호없이 세로로 출력된다
			}
		

		Iterator<String> it=list.iterator();
		while(it.hasNext()){//다음 데이터가 있는동안 계속
			
		String s=it.next();//데이터를 s에 대입
		System.out.println(s+"\t");
		
			}



	}
}