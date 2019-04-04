class animal_Test 
{
	public static void main(String[] args) 
	{
		animal cat=new animal();//객체 생성
		cat.name="고양이";
		cat.owner="Mike";

		//Scanner sc=new Scanner()과 구조가 같다.이것두 객체생성임

		System.out.println(cat.name);
		System.out.println(cat.owner);

		cat.bark();
		cat.eat();

		System.out.println("");


		animal dog=new animal();
		dog.name ="또치";
		dog.owner="소원이";

		System.out.println(dog.name);
		System.out.println(dog.owner);
		dog.bark();
		dog.eat();

		System.out.println("");

		animal unicon=new animal();
		unicon.name="유니콘";
		unicon.owner="Max";

		System.out.println(unicon.name);
		System.out.println(unicon.owner);
		unicon.bark();
		unicon.eat();

	}

}
