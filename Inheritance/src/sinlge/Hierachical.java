package sinlge;
class Fav
{
	void test()
	{
		System.out.println("rtat");
	}
}
class Gat extends Fav
{
	int man()
	
	{
		System.out.println("gad");
		return 0;
	}
}
class God extends Fav
{
	int a=10;
	void dof()
	{
		System.out.println(a);
	}
}
public class Hierachical {
public static void main(String[] args) {
	God g=new God();
	g.test();
	g.dof();
	
}	
}
