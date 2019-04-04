class logicalOpertator {
public static void main(String ar[]){
System.out.println('a'>'b'); //f
System.out.println(3>=2); //T
System.out.println(-1<0); //T
System.out.println(3.45<=2); //F
System.out.println(3==2); //F
System.out.println(3!=2); //T
System.out.println(!(3!=2)); //F
System.out.println((3>2)&&(3>4)); //F
System.out.println((3!=2)||(-1>0)); //T
System.out.println((3!=2)^(-1>0)); //T
}
}