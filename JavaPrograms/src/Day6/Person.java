package Day6;

public class Person {
	private String name;
	private int id;
	//Default constructor
	public Person()
	{
		this("karthik",12);//calling the parameterized constructor
		System.out.println("Default constructor has been called");
	}
	//parameterized constructor
	public Person(String name,int id)
	{
		this.id=id;
		this.name=name;
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", id=" + id + "]";
	}
	
}
