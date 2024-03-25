package AssignmentsOfJava;

public class OverloadingMainMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OverloadingMainMethod m=new OverloadingMainMethod();
		m.main();
		main(10);

	}
	public static void main(int a)
	{
		System.out.println("Integer static main method");
	}
	public void main()
	{
		System.out.println("Non static main method");
	}

}
