import java.util.*;

class ArrayList_Test1{
	public static void main(String ar[]){
		ArrayList<String> list=new ArrayList<String>();
		list.add("apple");
		list.add("mango");
		list.add("melon");
		list.add("grape");
		list.add(null);
		list.add(2,"strawberry�߰��߰�");//3��° �濡 �־��� �ڿ��ִ°� �ڵ����� �и���. ���ϴ� ��ġ�� ������ ���� ����
		System.out.println(list.get(3));//4��° �濡�ִ� �����͸� �������°�
		list.remove(2);//���������
		System.out.println(list.size());
		System.out.println(list.indexOf("mango"));
		list.clear();
		//list.add(3); Ÿ���� String�̴ϱ� 3�� �־����� ������ ����.


		System.out.println(list); //[apple, mango, melon, grape, null]


		for(String fluit: list)
			{
			System.out.println(fluit);//�׸��ȣ���� ���η� ��µȴ�
			}
		

		Iterator<String> it=list.iterator();
		while(it.hasNext()){//���� �����Ͱ� �ִµ��� ���
			
		String s=it.next();//�����͸� s�� ����
		System.out.println(s+"\t");
		
			}



	}
}