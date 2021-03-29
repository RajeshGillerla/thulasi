package sinlge;
class A
{
	void main()
	{
		System.out.println("def");
	}
}
class B extends A
{
	void catc()
	{
		System.out.println("math");
	}
}
public class SingleIn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			B b1=new B();
			b1.main();
			b1.catc();
	}

}
