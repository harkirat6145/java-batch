class Demo{

 void print()
{
System.out.println("null");
}
void print(int a){
System.out.println(a);
}
void print(float a){
System.out.println(a);
}
}

public class Overloads{
	public static void main(String a[]){
		Demo c = new Demo();
		c.print(6);
		c.print(7.9f);
		c.print();
	}
}