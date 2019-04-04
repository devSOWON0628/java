class arrayTest2{
public static void main(String ar[]){
	char c[]=new char[26];
	
	for (int i=0;i<c.length ;i++ )
	{
		c[i]=(char)(i+65);
		System.out.println(c[i]);
	}
}
}
