class animal_Test 
{
	public static void main(String[] args) 
	{
		animal cat=new animal();//��ü ����
		cat.name="�����";
		cat.owner="Mike";

		//Scanner sc=new Scanner()�� ������ ����.�̰͵� ��ü������

		System.out.println(cat.name);
		System.out.println(cat.owner);

		cat.bark();
		cat.eat();

		System.out.println("");


		animal dog=new animal();
		dog.name ="��ġ";
		dog.owner="�ҿ���";

		System.out.println(dog.name);
		System.out.println(dog.owner);
		dog.bark();
		dog.eat();

		System.out.println("");

		animal unicon=new animal();
		unicon.name="������";
		unicon.owner="Max";

		System.out.println(unicon.name);
		System.out.println(unicon.owner);
		unicon.bark();
		unicon.eat();

	}

}
