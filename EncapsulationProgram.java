package Encapsulation;

public class EncapsulationProgram {
	private int age=10;
	private String Un="abc@gmail.com";
	private String pwd="sjfh #$$$ ";
	private int otp=2345;
	public void setage(int age)
	{
		this.age=age;
	}
	public int getage()
	{
		return age;
	}
	public void setUn(String Un)
	{
		this.Un=Un;
	}
	public String getUn()
	{
		return Un;
	}
	public void setpwd(String pwd)
	{
		this.pwd=pwd;
	}
	public String getpwd()
	{
		return pwd;
	}
	public void Setotp(int otp)
	{
		this.otp=otp;
	}
	public int getotp()
	{
		return otp;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EncapsulationProgram e=new EncapsulationProgram();
		e.setage(40);
		e.setUn("swetha@gmail.com");
		e.setpwd("Swetha123@");
		e.Setotp(3456);
		System.out.println(e.getUn());
		System.out.println(e.getpwd());
		System.out.println(e.getage());
		System.out.println(e.getotp());
		

	}

}
