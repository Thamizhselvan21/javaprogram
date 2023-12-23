package Day6;

public class Executor {

	public static void main(String[] args) {
		Customer c1=new Customer();//invoking the default constructor
		System.out.println(c1);
		
		Customer c2=new Customer("Harina",113,"Mumbai");//invoking the parameterized constructor
		System.out.println(c2);
		
		Customer c3=new Customer("jagan",114);//invoking the parameterized constructor which one having a two arguments
		System.out.println(c3);
	}

}
