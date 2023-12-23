package Day6;

public class PersonDemo {

	public static void main(String[] args) {
		Person p1=new Person();//invoking the default constructor
		System.out.println(p1);
		//System.out.println(p1 instanceof Customer);//Compile time error
		System.out.println(p1 instanceof Person);
	}

}
