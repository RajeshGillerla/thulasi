package sinlge;
class Fan
{
	void sa()
	{
		System.out.println("tdd");
	}
}
class Man extends Fan
{
	void go()
	{
		System.out.println("doit");
	}
}
class Hen extends Man
{
	void fat()
	{
		System.out.println("fjh");
	}
}
public class MultiLevel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hen h1=new Hen();
		h1.sa();
		h1.go();
		h1.fat();
	}

}
