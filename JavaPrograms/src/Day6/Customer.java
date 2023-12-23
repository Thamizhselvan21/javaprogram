package Day6;

public class Customer {
	//instance variables
	private String custname;
	private int custid;
	private String city;
	
	//Explicit default constructor
	public Customer()
	{
		custname="Rajesh";
		custid=112;
		city="chennai";
	}
	//parameterized constructor 
	public Customer(String custname,int custid,String city)
	{
		this.custname=custname;
		this.custid=custid;
		this.city=city;
	}
	
	//Another parameterized constructor
	public Customer(String custname,int custid)
	{
		this.custid=custid;
		this.custname=custname;
	}
	@Override
	public String toString() {
		return "Customer [custname=" + custname + ", custid=" + custid + ", city=" + city + "]";
	}
	
	
}
